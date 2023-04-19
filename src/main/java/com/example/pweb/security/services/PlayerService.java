package com.example.pweb.security.services;

import com.example.pweb.dto.PlayerDTO;
import com.example.pweb.entities.Player;
import com.example.pweb.mapping.PlayerMapper;
import com.example.pweb.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerMapper playerMapper;

    public PlayerDTO getPlayerById(Long id) throws Exception {
        Optional<Player> optionalPlayer = playerRepository.findById(id);
        if (optionalPlayer.isPresent()) {
            Player player = optionalPlayer.get();
            return playerMapper.convertToDTO(player);
        } else {
            throw new Exception("Player not found");
        }
    }

    public List<PlayerDTO> getAllPlayers() throws Exception {
        List<Player> players = playerRepository.findAll();

        List<PlayerDTO> response = new ArrayList<>();
        players.forEach(player -> response.add(playerMapper.convertToDTO(player)));
        return response;
    }
}
