package org.cardealership.models;

public class CustomerSpendings extends Customer {
    private Double spendings;

    private Integer carsCount;

    public Double getSpendings() {
        return spendings;
    }

    public void setSpendings(Double spendings) {
        this.spendings = spendings;
    }

    public Integer getCarsCount() {
        return carsCount;
    }

    public void setCarsCount(Integer carsCount) {
        this.carsCount = carsCount;
    }
}
