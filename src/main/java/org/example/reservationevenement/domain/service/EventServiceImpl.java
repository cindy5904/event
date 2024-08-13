package org.example.reservationevenement.domain.service;

import org.example.reservationevenement.shared.dto.EventDto;
import org.example.reservationevenement.shared.port.EventPort;
import org.example.reservationevenement.shared.port.EventService;

import java.util.List;

public class EventServiceImpl implements EventService {

    private final EventPort eventPort;

    public EventServiceImpl(EventPort eventPort) {
        this.eventPort = eventPort;
    }

    @Override
    public EventDto save(EventDto event) {
        EventDto events = new EventDto(event);
        events = eventPort.save(events);
        return events;
    }

    @Override
    public List<EventDto> getAll() {
        return eventPort.getAll();
    }

    @Override
    public void delete(int id) {
        eventPort.delete(id);
    }
}
