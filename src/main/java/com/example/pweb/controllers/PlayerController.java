package com.example.pweb.controllers;

import com.example.pweb.dto.PlayerDTO;
import com.example.pweb.security.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/players")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping("/getPlayerById")
    public PlayerDTO getPlayerById(@RequestParam Long id) throws Exception {
        return playerService.getPlayerById(id);
    }

    @GetMapping("/getAllPlayers")
    public List<PlayerDTO> getAllPlayers() throws Exception {
        return playerService.getAllPlayers();
    }

}
