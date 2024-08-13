package org.example.reservationevenement.infrastructure.portimpl;

import org.example.reservationevenement.infrastructure.entity.EventEntity;
import org.example.reservationevenement.infrastructure.repository.EventEntityRepository;
import org.example.reservationevenement.shared.dto.EventDto;
import org.example.reservationevenement.shared.port.EventPort;

import java.util.List;

public class EventPortImpl implements EventPort {

    private final EventEntityRepository eventEntityRepository;

    public EventPortImpl(EventEntityRepository eventEntityRepository) {
        this.eventEntityRepository = eventEntityRepository;
    }

    @Override
    public EventDto save(EventDto event) {
        EventEntity eventEntity = EventEntity.builder().name(event.getName()).date(event.getDate()).build();
        eventEntity = eventEntityRepository.save(eventEntity);
        return new EventDto(eventEntity.getId(), eventEntity.getName(), eventEntity.getDate());
    }

    @Override
    public List<EventDto> getAll() {
        return ((List<EventEntity>)eventEntityRepository.findAll())
                .stream()
                .map((eventEntity -> new EventDto(eventEntity.getId(), eventEntity.getName(),
                        eventEntity.getDate())))
                .toList();
    }

    @Override
    public void delete(int id) {
        eventEntityRepository.deleteById(id);
    }
}
