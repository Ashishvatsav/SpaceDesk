package com.spacedesk.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "desks")
@Data
public class Desk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "workspace_id")
    private Workspace workspace;

    @Enumerated(EnumType.STRING)
    private DeskStatus deskStatus;
}