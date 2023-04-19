package com.example.pweb.serializers;

import com.example.pweb.entities.Team;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class TeamForPlayerSerializer extends JsonSerializer<Team> {

    @Override
    public void serialize(Team team, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String teamName = team.getName();
        jsonGenerator.writeObject(teamName);
    }
}