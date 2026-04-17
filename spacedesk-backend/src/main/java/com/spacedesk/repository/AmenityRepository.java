package com.spacedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spacedesk.model.Amenity;

public interface AmenityRepository extends JpaRepository<Amenity, Long> {
}