package com.tugaspbo.abstracts;

/*
Created at Wednesday 09 June 2021
Licensed @JustAo
Tugas tanggal 4 Februari 2021
 */

abstract class Hewan {

    String nama;

    public abstract void habitatHewan();

    public void namaHewan() {

        System.out.println("\n Method didalam abstract class hewan");
        System.out.println("Nama hewan :"+nama);
    }
}



