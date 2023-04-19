package com.example.pweb.repositories;

import com.example.pweb.entities.Event;
import com.example.pweb.entities.League;
import com.example.pweb.entities.Match;
import com.example.pweb.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findAllByMatch(Match match);
    List<Event> findAll();
    Optional<Event> findTeamById(Long id);
    @Override
    <S extends Event> S save(S team);
    void deleteById(Long id);
}
