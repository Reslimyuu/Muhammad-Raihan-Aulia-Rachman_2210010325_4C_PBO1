/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uaspbo2;


import java.util.Scanner;
public class Main {
    public static void main(String[] args){
      
        Mobil Mobil = new Mobil("Toyota", "Camry", 2020);

        // Menggunakan accessor dan mutator
        System.out.println("Data Dari Mobil");
        System.out.println("============================");
        System.out.println("Brand: " + Mobil.getBrand());
        System.out.println("Model: " + Mobil.getModel());
        System.out.println("Tahun: " + Mobil.getTahun());

        Mobil.setTahun(2021);
        System.out.println("Updated Year: " + Mobil.getTahun());
        System.out.println("Tahun: " + Mobil.getTahun());

        // Polymorphism
        System.out.println("=============================");
        System.out.println("Data dari Mobil");
        System.out.println("=============================");
        JenisKendaraan JenisKendaraan = new Mobil("Honda", "Civic", 2019);
        JenisKendaraan.displayInfo();
        System.out.println("=============================");
        
        Scanner scanner = new Scanner(System.in);

       
        // Menampilkan pilihan merek mobil  
        // Error Handling dengan IO Sederhana
        String[] brands = {"Toyota", "Honda", "Nissan"};
        System.out.println("Brands Yang Ada ");
        for (int i = 0; i < brands.length; i++) {
            System.out.println((i + 1) + ". " + brands[i]);  
        }

        // Meminta pengguna untuk memilih merek mobil
        System.out.print("Masukkan Nomor Mobil Yang Kamu Pilih :  ");
        int PilihanBrands;
        try {
            PilihanBrands= scanner.nextInt();
            if (PilihanBrands < 1 || PilihanBrands > brands.length) {
                System.out.println("Salah Pilihan");
                PilihanBrands = 1;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Salah Pilihan. Akan diubah ke Toyota");
            PilihanBrands = 1;
            scanner.next(); // membersihkan input yang tidak valid
        }
        String Brandsdipilih = brands[PilihanBrands - 1];
        scanner.nextLine(); // Membersihkan newline character

        // Meminta input dari pengguna untuk model dan tahun mobil
        System.out.println("Masukan Model Mobil : ");
        String model = scanner.nextLine();

        System.out.print("Masukkan Tahun Mobil :  ");
        int tahun;
        try {
            tahun = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Salah Tahunnya ");
            tahun = 2000;
            scanner.next(); // membersihkan input yang tidak valid
        }


        // Polymorphism with Overloading
        System.out.println("==============================");
        System.out.println("|Nomor Mobil : "+ PilihanBrands);
        System.out.println("|Model Mobil : "+ model);
        System.out.println("|Tahun Mobil : "+ tahun);
        Mobil.displayInfo(" |Mobilnya Kondisi nya Bagus");
        

        // Seleksi (Selection)
        if (Mobil.getTahun() > 2020) {
            System.out.println("Mobil Baru");
        } else {
            System.out.println("Mobilnya lama");
        }

        System.out.println("===========================");
        // Perulangan (Looping) dan Array
        for (String brand : brands) {
            System.out.println("Brand: " + brand);
            System.out.println("===========================");
        }

       }
    
}
