package com.example.pweb.controllers;

import com.example.pweb.dto.TeamDTO;
import com.example.pweb.repositories.TeamRepository;
import com.example.pweb.security.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/teams")
public class TeamController {
    @Autowired
    TeamService teamService;

    @GetMapping("/getAllTeams")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public List<TeamDTO> getAllTeams() {
        return teamService.getAllTeams();
    }
}
