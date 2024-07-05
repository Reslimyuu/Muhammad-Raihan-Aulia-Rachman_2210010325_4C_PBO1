/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uaspbo2;

/**
 *
 * @author reyhan
 */
public class JenisKendaraan {
    private String brand;
    private String model;

    // Constructor
    public JenisKendaraan(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Accessor
    public String getBrand() {
        return brand;
    }

    // Mutator
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Accessor
    public String getModel() {
        return model;
    }

    // Mutator
    public void setModel(String model) {
        this.model = model;
    }

    // Method yang akan di-override oleh subclass
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }


    
    
    
    
}
