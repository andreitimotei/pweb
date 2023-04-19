package com.example.pweb.serializers;

import com.example.pweb.entities.League;
import com.example.pweb.entities.Team;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class LeagueSerializer extends JsonSerializer<League> {
    @Override
    public void serialize(League league, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeObject(league.getName());
    }
}
