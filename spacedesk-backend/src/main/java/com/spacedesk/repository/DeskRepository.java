package com.spacedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spacedesk.model.Desk;

public interface DeskRepository extends JpaRepository<Desk, Long> {
}