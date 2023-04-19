package com.example.pweb.mapping;

import com.example.pweb.dto.PlayerDTO;
import com.example.pweb.dto.TeamDTO;
import com.example.pweb.entities.Player;
import com.example.pweb.entities.Team;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {
    @Autowired
    ModelMapper modelMapper;

    public TeamDTO convertToDTO(Team team) {
        return modelMapper.map(team, TeamDTO.class);
    }

    public Team convertToPlayer(TeamDTO teamDTO) {
        return modelMapper.map(teamDTO, Team.class);
    }
}
