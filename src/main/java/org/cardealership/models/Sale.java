package org.cardealership.models;

import javax.persistence.Entity;

@Entity(name = "sales")
public class Sale extends Identifiable {
    private Double discount;
}
