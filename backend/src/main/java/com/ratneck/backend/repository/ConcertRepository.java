package com.ratneck.backend.repository;

import com.ratneck.backend.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertRepository extends JpaRepository<Concert, Long> {
}
