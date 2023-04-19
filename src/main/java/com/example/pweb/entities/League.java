package com.example.pweb.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "league", schema = "new_schema")
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "league_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "country", nullable = false)
    private String country;

    @OneToMany(mappedBy = "league")
    private List<Team> teamList;

    @OneToMany(mappedBy = "league")
    private List<Match> matchList;

    @OneToMany(mappedBy = "league")
    private List<Player> topGoalscorers;

    public League(String name,
                  String country) {
        this.name = name;
        this.country = country;
    }
}
