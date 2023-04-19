package com.example.pweb.repositories;

import com.example.pweb.entities.League;
import com.example.pweb.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findAllByLeague(League league);
    List<Team> findAll();
    Optional<Team> findTeamById(Long id);
    Optional<Team> findByName(String name);
    @Override
    <S extends Team> S save(S team);
    void deleteById(Long id);
}
