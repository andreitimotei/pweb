package com.example.pweb.repositories;

import com.example.pweb.entities.League;
import com.example.pweb.entities.Player;
import com.example.pweb.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findAll();
    List<Player> findAllByTeam(Team team);
    Optional<Player> findById(Long id);
    List<Player> findPlayersByLeague(League league);
    @Override
    <S extends Player> S save(S player);
    void deleteById(Long id);

}
