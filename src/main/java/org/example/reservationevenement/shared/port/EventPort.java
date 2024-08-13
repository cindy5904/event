package org.example.reservationevenement.shared.port;

import org.example.reservationevenement.shared.dto.EventDto;

import java.util.List;

public interface EventPort {
    EventDto save(EventDto event);
    List<EventDto> getAll();
    public void delete(int id);
}
