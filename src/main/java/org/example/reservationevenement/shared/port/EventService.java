package org.example.reservationevenement.shared.port;

import org.example.reservationevenement.shared.dto.EventDto;

import java.time.LocalDate;
import java.util.List;

public interface EventService {

    EventDto save(EventDto event);
    List<EventDto> getAll();
    public void delete(int id);


}
