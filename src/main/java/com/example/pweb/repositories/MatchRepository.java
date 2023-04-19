package com.example.pweb.repositories;

import com.example.pweb.entities.League;
import com.example.pweb.entities.Match;
import com.example.pweb.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> findAllByLeague(League league);
    List<Match> findAll();
    Optional<Match> findTeamById(Long id);
    @Override
    <S extends Match> S save(S team);
    void deleteById(Long id);
}
