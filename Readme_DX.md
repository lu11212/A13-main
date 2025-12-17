# TestingRobotChallenge

## Descrizione del task svolto e Id del Task
-Il task assegnato, con Id R6, riguarda la progettazione e l’implementazione di una pagina dedicata al Profilo del Giocatore, con l’obiettivo di rendere più organica, accessibile e scalabile la visualizzazione delle informazioni personali e delle statistiche di gioco. Nella versione di partenza le informazioni relative al profilo del giocatore risultano distribuite in maniera frammentata all’interno della piattaforma e sono rese disponibili tramite pulsanti presenti nel menù in alto a destra della home page, senza una vista unificata e strutturata a causa dell’assenza di un’area riservata. Si prevede quindi la realizzazione di una pagina Profilo dedicata, accessibile al giocatore autenticato, che consenta di visualizzare in modo centralizzato le principali informazioni personali e di gioco. In particolare, la pagina deve includere una sezione fissa, contenente elementi identificativi del giocatore come immagine/avatar e biografia, e una sezione variabile, in cui le informazioni visualizzate possono essere selezionate dinamicamente dall’utente tramite un selettore presente nella UI, ispirato al meccanismo già adottato nella pagina degli achievement. Le informazioni che la pagina Profilo deve consentire di visualizzare includono, tra le altre, un riepilogo delle statistiche personali (partite giocate, punti esperienza, badge guadagnati), le classifiche dei giocatori, la cronologia delle partite (game history) e funzionalità sociali come la ricerca di profili di altri giocatori e la possibilità di aggiunge gli stessi alla propria lista di utenti seguiti attraverso un pulsante ‘follow’. La soluzione proposta mira a evitare l’affollamento dell’interfaccia, migliorando l’usabilità grazie alla selezione dinamica dei contenuti, e risulta facilmente estendibile per supportare in futuro la visualizzazione di ulteriori informazioni o funzionalità.

## Implementazione del Task
Il task è stato implementato rinnovando completamente la pagina del Profilo Utente, trasformandola in un punto centrale per la gestione dell'account e delle relazioni sociali. L'obiettivo è stato rendere la visualizzazione dei dati più organica: ora l'utente può consultare in un'unica schermata le proprie informazioni personali, il livello di gioco raggiunto e la rete di amicizie.

A livello architetturale, l'aggiornamento ha richiesto:

-Centralizzazione del recupero dati: È stata riattivata e potenziata la logica che, all'apertura del profilo, raccoglie e aggrega le informazioni provenienti da diverse fonti (anagrafica utente, statistiche di gioco e storico partite).

-Miglioramento della comunicazione tra servizi: Sono stati aggiornati i collegamenti tra il Front-end (T5) e il Backend (T23). Il Front-end ora è in grado di inviare correttamente le richieste di modifica del profilo e di lettura dei dati, garantendo che ogni operazione sia sicura e riconosciuta dal sistema.

-Ottimizzazione dell'esperienza utente: I file del front-end sono stati riorganizzati per rendere la pagina più reattiva. Operazioni come la ricerca di nuovi amici o la gestione del "segui/smetti di seguire" avvengono ora in modo fluido, aggiornando l'interfaccia immediatamente senza costringere l'utente a ricaricare la pagina.

-Integrazione delle funzionalità Social: Sono state aggiunte le logiche necessarie per visualizzare i profili degli altri giocatori, permettendo di interagire con loro direttamente dalla dashboard di ricerca.

### Modifiche ai Microservizi

| Microservizio / Modulo            | Tipo di Modifica      | Note |
|----------------------------------|---------------------|----------------------------------|
| Achievement.html (T5)             | Eliminato           | Eliminazione pagina dedicata per insrimento Tab nella pagina profilo                                |
| GameHistory.html (T5)             | Eliminato           | Eliminazione pagina dedicata per insrimento Tab nella pagina profilo                                 |
| Leaderboard.html (T5)             | Eliminato           | Eliminazione pagina dedicata per insrimento Tab nella pagina profilo                                 |
| Navbar.html (T5)                  | Modificato          | Rimozione pulsanti Achievement, Leaderboard, Games che reindirizzavano a pagine dedicate                                |
| edit-profile.html (T5)            | Modificato          | Aggiunta di label per i campi da aggiornare, aggiunta input hidden per campo mail, aggiunta div per le notifiche per coerenza con js                                |
| profile.html (T5)                 | Modificato          | Aggiunta del Tab per Achievement, GameHistory, Leaderboard, modifica endpoint per funzionalità social, modifica recupero paramtri per coerenza con le informazini da reperire                                  |
| search.html (T5)                  | Modificato          | Aggiunta di metodi per autenticazione, modifica endopoint, modifica recupero paramtri per coerenza con le informazini da reperire, rimozione logica javascript superflua                                |
| Achievement.css (T5)              | Aggiunto            | Aggiornamento stile grafico                                |
| GameHistory.css (T5)              | Aggiunto            | Aggiornamento stile grafico                                |
| profile-edit.css (T5)             | Modificato          | Aggiornamento stile grafico                                |
| profile.css (T5)                  | Modificato          | Aggiornamento stile grafico                                |
| Achievement.js (T5)               | Aggiunto            | Logica javascript associata al nuovo componente Achievement da visualizzare nel profilo, internazionalizzazione                                |
| GameHistory.js (T5)               | Aggiunto            | Logica javascript associata al nuovo componente GameHisotry da visualizzare nel profilo, internazionalizzazione                                |
| Leaderboard.js (T5)               | Modificato          | Logica javascript associata al nuovo componente Leaderboard da visualizzare nel profilo                                |
| profile-edit.js (T5)              | Modificato          | Modifica dell'endopoint per funzioanlità update, modifica recupero paramtri per coerenza con le informazini da reperire, internazionalizzazione                                |
| language.js (T5)              | Modificato          | internazionalizzazione                                |
| T23Service.java (T5)              | Modificato          | Aggiunta/Aggiornamento dei metodi che richiamano funzionalità esposti dai vari microservizi per il recupero delle informazioni relativamente a Social, GameHistory, LeaderBoard, Achievement, Modifica Profilo                 |
| UserProfileComponent.java (T5)    | Modificato          | Modifica della action riferita per recupero dei dati del profilo utente a partire dall'id del profilo.                               |
| UserProfileController.java (T5)   | Modificato          | Aggiunta/Aggiornamento delle rotte per la gestione del recupero delle informazioni relativamente a Social, GameHistory, LeaderBoard, Achievement, Modifica Profilo.                                |
| messages_it.properties (T5)              | Modificato          | etichette internazionalizzazione                                |
| messages_en.properties (T5)              | Modificato          | etichette internazionalizzazione                                |
| messages_es.properties (T5)              | Modificato          | etichette internazionalizzazione                                |
| UserSocialController.java (T23)   | Modificato          | Aggiunta della rotta che gestisca il recupero delle informazioni utente a partire dall'id del profilo                                |
| PlayerService.java (T23)          | Modificato          | Aggiunta metodo per il recupero delle informazioni utente a partire dall'id del profilo                             |