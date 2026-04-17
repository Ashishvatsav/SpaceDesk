package com.spacedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spacedesk.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
