package com.rocketseat.planner.trip;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String destination;

    @Column(name = "starts_at",nullable = false)
    private LocalDateTime starstAt;

    @Column(name = "ends_at",nullable = false)
    private LocalDateTime endstAt;

    @Column(name = "is_confirmed",nullable = false)
    private Boolean isConfirmed;

    @Column(name = "owner_name",nullable = false)
    private String ownerName;

    @Column(name = "owner_email",nullable = false)
    private String ownerEmail;
}
