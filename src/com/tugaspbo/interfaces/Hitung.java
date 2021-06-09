package com.tugaspbo.interfaces;

/*
Created at Wednesday 09 june 2021
Licensed @JustAO
Tugas tanggal 4 Februari 2021
 */

public class Hitung implements Operasi{

    double Lingkaran, Persegi;
    double sisi=5;

    @Override
    public void kelilingLingkaran(double radius) {
        System.out.println("\r. Menghitung Keliling Lingkaran");
        System.out.println("NilaiRadius = " + radius+kons_panjang);
    }

    @Override
    public void kelilingPersegi() {
        System.out.println("\r. Menghitung Keliling Persegi");
        System.out.println("Nilai Sisi =" +sisi+kons_panjang);
        Persegi = 4*sisi;
        System.out.println("Keliling Persegi =" +Persegi+kons_panjang);


    }
}
