package org.example.reservationevenement.infrastructure.repository;

import org.example.reservationevenement.infrastructure.entity.EventEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventEntityRepository extends CrudRepository<EventEntity, Integer> {
}
