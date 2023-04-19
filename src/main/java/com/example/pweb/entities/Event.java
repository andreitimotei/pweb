package com.example.pweb.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "events", schema = "new_schema")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long id;

    @Column(name = "event_type", nullable = false)
    private String eventType;

    @Column(name = "minute", nullable = false)
    private int minute;

//    1 - home; 2 - away
    @Column(name = "team", nullable = false)
    private int team;

    @OneToOne()
    private Player playerInvolved;

    @ManyToOne()
    @JoinColumn(name = "match_id")
    private Match match;

    public Event(String eventType,
                 int minute,
                 int team) {
        this.eventType = eventType;
        this.minute = minute;
        this.team = team;
    }
}
