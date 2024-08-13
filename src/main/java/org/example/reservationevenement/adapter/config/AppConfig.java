package org.example.reservationevenement.adapter.config;

import org.example.reservationevenement.domain.service.EventServiceImpl;
import org.example.reservationevenement.infrastructure.portimpl.EventPortImpl;
import org.example.reservationevenement.infrastructure.repository.EventEntityRepository;
import org.example.reservationevenement.shared.port.EventPort;
import org.example.reservationevenement.shared.port.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Autowired
    private EventEntityRepository eventEntityRepository;

//    @Autowired
//    public AppConfig(EventEntityRepository eventEntityRepository) {
//        this.eventEntityRepository = eventEntityRepository;
//    }

    @Bean
    public EventServiceImpl eventServiceImpl() {
        return new EventServiceImpl(eventPort());
    }

    @Bean
    public EventPort eventPort() {
        return new EventPortImpl(eventEntityRepository);
    }
}
