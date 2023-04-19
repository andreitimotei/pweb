package com.example.pweb.dto;

import com.example.pweb.entities.League;
import com.example.pweb.entities.Team;
import com.example.pweb.serializers.LeagueSerializer;
import com.example.pweb.serializers.TeamForPlayerSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@Data
public class PlayerDTO {
    private Long id;

    private String fullName;

    private String lastName;

    private String country;

    private int gamesPlayed;

    private int goalsScored;

    private int assists;

    private int yellowCards;

    private int redCards;

    @JsonSerialize(using = TeamForPlayerSerializer.class)
    private Team team;

    @JsonSerialize(using = LeagueSerializer.class)
    private League league;
}
