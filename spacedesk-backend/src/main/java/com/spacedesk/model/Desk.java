package com.spacedesk.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "desks")
@Data
@Getter
@Setter
public class Desk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "workspace_id")
    @JsonProperty("workspace")
    private Workspace workspace;

    @Enumerated(EnumType.STRING)
    @JsonProperty("deskStatus")
    private DeskStatus deskStatus;
}