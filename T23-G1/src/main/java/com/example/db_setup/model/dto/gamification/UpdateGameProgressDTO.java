package com.example.db_setup.model.dto.gamification;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UpdateGameProgressDTO {
    private boolean isWon;
    private Set<String> achievements;
}
