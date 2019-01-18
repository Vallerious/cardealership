package org.cardealership.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String make;

    private String model;

    private Long travelledDistance;

    @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
            @JoinTable(
                    name = "parts_cars",
                    joinColumns = {
                            @JoinColumn(name = "part_id")
                    },
                    inverseJoinColumns = {
                            @JoinColumn(name = "car_id")
                    }
            )
    Set<Part> parts = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getTravelledDistance() {
        return travelledDistance;
    }

    public void setTravelledDistance(Long travelledDistance) {
        this.travelledDistance = travelledDistance;
    }

    public Set<Part> getParts() {
        return parts;
    }

    public void setParts(Set<Part> parts) {
        this.parts = parts;
    }
}
