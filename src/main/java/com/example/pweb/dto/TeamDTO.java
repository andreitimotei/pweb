package com.example.pweb.dto;

import com.example.pweb.entities.Match;
import com.example.pweb.entities.Player;
import com.example.pweb.serializers.MatchListSerializer;
import com.example.pweb.serializers.PlayerListSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.util.List;

@Data
public class TeamDTO {

    private Long id;

    private String name;

    private int points;

    private String country;

    private int goalsFor;

    private int goalsAgainst;

    @JsonSerialize(using = PlayerListSerializer.class)
    private List<Player> playerList;

    @JsonSerialize(using = MatchListSerializer.class)
    private List<Match> homeMatches;

    @JsonSerialize(using = MatchListSerializer.class)
    private List<Match> awayMatches;
}
