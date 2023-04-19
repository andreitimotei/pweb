package com.example.pweb.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="teams", schema="new_schema")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "points", nullable = false)
    private int points;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "goals_for", nullable = false)
    private int goalsFor;

    @Column(name = "goals_against", nullable = false)
    private int goalsAgainst;

    @OneToMany(mappedBy = "team")
    private List<Player> playerList;

    @OneToMany(mappedBy = "homeTeam")
    private List<Match> homeMatches;

    @OneToMany(mappedBy = "awayTeam")
    private List<Match> awayMatches;

    @ManyToOne
    @JoinColumn(name = "league_id")
    private League league;

    public Team(String name,
                int points,
                String country,
                int goalsFor,
                int goalsAgainst) {
        this.name = name;
        this.points = points;
        this.country = country;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public void addPlayers(Collection<Player> players) {
        players.forEach(player -> player.setTeam(this));
    }
}
