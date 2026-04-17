package com.spacedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spacedesk.model.Workspace;

public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {
}
