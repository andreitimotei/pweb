package com.example.pweb.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "mathces", schema = "new_schema")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "match_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "home_team_id", referencedColumnName = "team_id")
    private Team homeTeam;

    @Column(name = "home_team_goals", nullable = false)
    private int homeTeamGoals;

    @ManyToOne
    @JoinColumn(name = "away_team_id", referencedColumnName = "team_id")
    private Team awayTeam;

    @Column(name = "away_team_goals", nullable = false)
    private int awayTeamGoals;

    @Column(name = "game_time", nullable = false)
    private String gameTime;

    @OneToMany
    @JoinColumn(name = "match")
    private List<Event> eventList;

    @ManyToOne
    @JoinColumn(name = "league_id")
    private League league;

    public Match(int homeTeamGoals,
                 int awayTeamGoals,
                 String gameTime) {
        this.homeTeamGoals = homeTeamGoals;
        this.awayTeamGoals = awayTeamGoals;
        this.gameTime = gameTime;
    }
}
