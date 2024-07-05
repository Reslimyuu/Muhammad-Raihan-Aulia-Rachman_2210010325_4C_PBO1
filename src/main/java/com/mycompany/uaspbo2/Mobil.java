/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uaspbo2;


public class Mobil extends JenisKendaraan {
     private int Tahun;

    // Constructor
    public Mobil(String brand, String model, int Tahun) {
        super(brand, model);
        this.Tahun = Tahun;
    }

    // Accessor
    public int getTahun() {
        return Tahun;
    }

    // Mutator
    public void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }

    // Override method displayInfo dari superclass
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tahun: " + Tahun);
    }

    // Overloaded displayInfo method
    public void displayInfo(String additionalInfo) {
        super.displayInfo();
        System.out.println("|Tahun: " + Tahun );
        System.out.println("|Additional Info : " + additionalInfo);
    }
        
}
