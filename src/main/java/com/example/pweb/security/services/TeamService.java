package com.example.pweb.security.services;

import com.example.pweb.dto.TeamDTO;
import com.example.pweb.mapping.TeamMapper;
import com.example.pweb.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private TeamMapper teamMapper;

    public List<TeamDTO> getAllTeams() {
        return teamRepository.findAll().stream().map(teamMapper::convertToDTO).collect(Collectors.toList());
    }
}
