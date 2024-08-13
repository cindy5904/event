package org.example.reservationevenement.shared.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EventDto {
    private int id;
    private String name;
    private LocalDate date;

    public EventDto(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }


    public EventDto(int id, String name, LocalDate date) {
        this(name, date);
        this.id = id;

    }

    public EventDto() {
    }

    public EventDto(EventDto event) {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}
