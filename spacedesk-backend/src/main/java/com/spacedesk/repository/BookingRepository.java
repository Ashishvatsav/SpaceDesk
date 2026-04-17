package com.spacedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spacedesk.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}