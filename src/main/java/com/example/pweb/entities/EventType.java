package com.example.pweb.entities;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EventType {
    GOAL("g"),
    YELLOW_CARD("yc"),
    RED_CARD("rc"),
    SUB_IN("si"),
    SUB_OFF("so"),
    OWN_GOAL("og");

    private final String code;

    EventType(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }
}
