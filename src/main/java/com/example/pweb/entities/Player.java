package com.example.pweb.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="players", schema="new_schema")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "games_played", nullable = false)
    private int gamesPlayed;

    @Column(name = "goals_scored", nullable = false)
    private int goalsScored;

    @Column(name = "assists", nullable = false)
    private int assists;

    @Column(name = "yellow_cards", nullable = false)
    private int yellowCards;

    @Column(name = "red_cards", nullable = false)
    private int redCards;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "league_id")
    private League league;

    public Player(String fullName,
                  String lastName,
                  String country,
                  int gamesPlayed,
                  int goalsScored,
                  int assists,
                  int yellowCards,
                  int redCards) {
        this.fullName = fullName;
        this.lastName = lastName;
        this.country = country;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }

}
