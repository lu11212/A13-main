package com.t4.gamerepo.model.repositories;

import com.t4.gamerepo.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(value = "SELECT * " +
            "FROM games AS g JOIN players AS p ON g.id = p.game_id " +
            "WHERE :playerId = p.player_id", nativeQuery = true)
    List<Game> findByPlayerId(@Param("playerId") Long playerId);
}
