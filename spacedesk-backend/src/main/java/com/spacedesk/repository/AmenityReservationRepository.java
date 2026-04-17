package com.spacedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spacedesk.model.AmenityReservation;

public interface AmenityReservationRepository extends JpaRepository<AmenityReservation, Long> {
}
