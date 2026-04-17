package com.spacedesk.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "workspaces")
@Data
public class Workspace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String location;
}