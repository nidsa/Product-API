package com.example.product_api;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double pricePerUnit;
    private Boolean activeForSell;

    // Default constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(String name, Double pricePerUnit, Boolean activeForSell) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.activeForSell = activeForSell;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public Boolean getActiveForSell() {
        return activeForSell;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void setActiveForSell(Boolean activeForSell) {
        this.activeForSell = activeForSell;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pricePerUnit=" + pricePerUnit +
                ", activeForSell=" + activeForSell +
                '}';
    }
}
