package org.example.reservationevenement.adapter.controller;

import org.example.reservationevenement.domain.service.EventServiceImpl;
import org.example.reservationevenement.shared.dto.EventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventServiceImpl eventService;

    @Autowired
    public EventController(EventServiceImpl eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public ResponseEntity<EventDto> save(EventDto eventDto) {
        return ResponseEntity.ok(eventService.save(eventDto));
    }

    @GetMapping
    public ResponseEntity<List<EventDto>> get() {
        return ResponseEntity.ok(eventService.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        eventService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
