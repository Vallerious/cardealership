package org.cardealership.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "parts")
public class Part extends Identifiable {

    private String name;

    private Double price;

    private Integer quantity;

    @ManyToMany(mappedBy = "parts")
    Set<Car> cars = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}
