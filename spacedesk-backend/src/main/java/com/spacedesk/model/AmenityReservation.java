package com.spacedesk.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "amenity_reservations")
@Data
public class AmenityReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "amenity_id")
    private Amenity amenity;

    @Enumerated(EnumType.STRING)
    private AmenityStatus amenityStatus;
}