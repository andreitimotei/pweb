package com.example.pweb.serializers;

import com.example.pweb.entities.Player;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.List;

public class PlayerListSerializer extends JsonSerializer<List<Player>> {

    @Override
    public void serialize(List<Player> players, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartArray();
        for (Player player: players) {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeObjectField("fullName", player.getFullName());
            jsonGenerator.writeEndObject();
        }
        jsonGenerator.writeEndArray();
    }
}
