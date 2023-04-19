package com.example.pweb.serializers;

import com.example.pweb.entities.Match;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.List;

public class MatchListSerializer extends JsonSerializer<List<Match>> {

    @Override
    public void serialize(List<Match> matches, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartArray();
        for (Match match : matches) {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeObjectField("homeTeam", match.getHomeTeam().getName());
            jsonGenerator.writeObjectField("homeTeamGoals", match.getHomeTeamGoals());
            jsonGenerator.writeObjectField("awayTeam", match.getAwayTeam().getName());
            jsonGenerator.writeObjectField("awayTeamGoals", match.getAwayTeamGoals());
            jsonGenerator.writeEndObject();
        }
        jsonGenerator.writeEndArray();
    }
}
