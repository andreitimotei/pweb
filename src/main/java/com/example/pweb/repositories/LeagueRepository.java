package com.example.pweb.repositories;

import com.example.pweb.entities.League;
import com.example.pweb.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LeagueRepository extends JpaRepository<League, Long> {
    List<League> findAll();
    Optional<League> findLeagueById(Long id);
    @Override
    <S extends League> S save(S team);
    void deleteById(Long id);
}
