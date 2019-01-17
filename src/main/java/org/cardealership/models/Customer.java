package org.cardealership.models;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    private boolean isYoungDriver;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean getIsYoungDriver() {
        return isYoungDriver;
    }

    public void setIsYoungDriver(boolean youngDriver) {
        isYoungDriver = youngDriver;
    }
}
