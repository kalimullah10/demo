package com.example.entity;

import jakarta.persistence.*;


//import java.util.LinkedHashSet;
//import java.util.Set;


@Entity
@Table(name = "stop")
public class Stop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "stop_name", nullable = false)
    private String stopName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    //
//    @ManyToMany
//    @JoinTable(name = "stop_buses",
//            joinColumns = @JoinColumn(name = "stop_id"),
//            inverseJoinColumns = @JoinColumn(name = "buses_id"))
//    private Set<Bus> buses = new LinkedHashSet<>();
//
// this is easy way many to many mapping   other then create  a new class like BusStop  in entities
}