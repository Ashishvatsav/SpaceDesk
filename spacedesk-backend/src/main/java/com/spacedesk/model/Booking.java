package com.spacedesk.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@Data
@Getter
@Setter
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonProperty("user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "desk_id")
    @JsonProperty("desk")
    private Desk desk;

    @JsonProperty("startTime")
    private LocalDateTime startTime;

    @JsonProperty("endTime")
    private LocalDateTime endTime;

    @Enumerated(EnumType.STRING)
    @JsonProperty("bookingStatus")
    private BookingStatus bookingStatus;
}