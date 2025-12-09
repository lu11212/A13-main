package com.example.db_setup.controller;

import com.example.db_setup.model.Player;
import com.example.db_setup.model.UserProfile;
import com.example.db_setup.service.PlayerService;
import com.example.db_setup.service.UserSocialService;
import com.example.db_setup.service.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/profile")
public class UserSocialController {

    @Autowired
    private UserSocialService userSocialService;
    @Autowired
    private PlayerService playerService;

// ==========================================
    // ==== RICERCA PROFILI (Fix JSON Vuoto) ====
    // ==========================================
 @GetMapping("/searchUserProfiles")
    public ResponseEntity<Map<String, Object>> searchUserProfiles(
            @RequestParam String searchTerm,
            @RequestParam int page,
            @RequestParam int size) {
        
        // DEBUG: Vediamo cosa arriva davvero qui
        System.out.println("T23 SEARCH: Cercando '" + searchTerm + "'");

        Page<UserProfile> pageResult = userSocialService.searchUserProfiles(searchTerm, page, size);
        
        System.out.println("T23 SEARCH: Trovati " + pageResult.getTotalElements() + " risultati");
        
        // 2. Costruiamo MANUALMENTE la risposta JSON semplice
        // Questo è il trucco: creiamo una Mappa che diventa un JSON sicuro
        Map<String, Object> response = new HashMap<>();
        
        response.put("content", pageResult.getContent());       // LISTA UTENTI (Quello che ci serve!)
        response.put("totalPages", pageResult.getTotalPages());   
        response.put("totalElements", pageResult.getTotalElements()); 
        
        // 3. Restituiamo la mappa
        return ResponseEntity.ok(response);
    }

    // ====================================================================
    // ==== METODO GET USER BY EMAIL (CORRETTO) ===========================
    // ====================================================================
    @GetMapping("/user_by_email")
    @ResponseBody
    public ResponseEntity<?> getUserByEmail(@RequestParam("email") String email) {
        try {
            // 1. Recupera il profilo dal database
            UserProfile profile = playerService.findProfileByEmail(email);
            
            if (profile == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Utente non trovato");
            }
            
            // 2. Costruiamo la risposta manualmente per T5
            Map<String, Object> response = new HashMap<>();
            
            // GESTIONE ID SICURA (Fix Compile Error)
            Long safeId = 0L;
            try {
                // CORREZIONE: getUserId() è già un Long, quindi lo usiamo direttamente
                if (profile.getUserId() != null) {
                     safeId = profile.getUserId();
                }
            } catch (Exception e) {
                // Fallback estremo se qualcosa va storto
                safeId = (long) email.hashCode();
            }
            
            response.put("id", safeId);
            response.put("email", email);
            response.put("userProfile", profile);
            
            // Campi di comodo per il frontend
            response.put("name", profile.getName());
            response.put("surname", profile.getSurname());
            response.put("nickname", profile.getNickname());
            
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Errore server T23: " + e.getMessage());
        }
    }

    @PostMapping("/getStudentiTeam")
    public ResponseEntity<?> getStudentiTeam(@RequestBody List<String> idsStudenti) {
        return playerService.getStudentiTeam(idsStudenti);
    }

    // --- SOCIAL (Followers/Following) ---
    @GetMapping("/followers")
    public ResponseEntity<?> getFollowers(@RequestParam String userId) {
        try {
            return ResponseEntity.ok(userSocialService.getFollowers(userId));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Errore");
        }
    }

    @GetMapping("/following")
    public ResponseEntity<?> getFollowing(@RequestParam String userId) {
        try {
            return ResponseEntity.ok(userSocialService.getFollowing(userId));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Errore");
        }
    }

    @GetMapping("/isFollowing")
    public ResponseEntity<?> isFollowing(@RequestParam String followerId, @RequestParam String followingId) {
        try {
            boolean result = userSocialService.isFollowing(followerId, followingId);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Errore");
        }
    }

    @PostMapping("/toggle_follow")
    public ResponseEntity<?> toggleFollow(@RequestParam String followerId, @RequestParam String followingId) {
        try {
            boolean FollowState = userSocialService.toggleFollow(followerId, followingId);
            return ResponseEntity.ok(FollowState);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Errore");
        }
    }

// ====================================================================
    // ==== METODO UPDATE PROFILE (Versione Debug e Fix) ==================
    // ====================================================================
    @PostMapping("/updateProfile")
    public ResponseEntity<Boolean> editProfile(
            @RequestParam("email") String email,
            @RequestParam("bio") String bio,
            @RequestParam("profilePicturePath") String profilePicturePath,
            @RequestParam(value = "nickname", required = false, defaultValue = "default_nickname") String nickname) {
        
        System.out.println("--- T23: Ricevuta richiesta di update per " + email + " ---");
        System.out.println("Dati: Bio='" + bio + "', Nick='" + nickname + "', Img='" + profilePicturePath + "'");

        try {
            // 1. Recuperiamo il profilo ESISTENTE dal DB (così è "attaccato" alla sessione Hibernate)
            UserProfile profile = playerService.findProfileByEmail(email);
            
            if (profile == null) {
                System.out.println("ERRORE T23: Profilo non trovato per email " + email);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false);
            }
            
            // 2. Aggiorniamo i campi
            profile.setBio(bio);
            profile.setProfilePicturePath(profilePicturePath);
            
            if (nickname != null && !nickname.isEmpty()) {
                profile.setNickname(nickname);
            }
            
            // 3. Salviamo
            System.out.println("T23: Tentativo salvataggio...");
            playerService.saveProfile(profile);
            System.out.println("T23: Salvataggio riuscito!");
            
            return ResponseEntity.ok(true);
            
        } catch (Exception e) {
            // QUESTO È FONDAMENTALE: Stampa l'errore vero nel terminale di T23
            System.err.println("ECCEZIONE GRAVE IN T23 UPDATE:");
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
        }
    }
}