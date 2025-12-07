package main;

import java.util.Scanner;

public class Day091 {
    
    // Method dengan 1 parameter (String)
    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    // Method dengan 2 parameter (int)
    static int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Memanggil method sapa
        System.out.print("Masukkan nama kamu: ");
        String nama = input.nextLine();
        sapa(nama);

        // Penjumlahan
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int hasilTambah = tambah(angka1, angka2);
        System.out.println("Hasil penjumlahan: " + hasilTambah);
    }
}

          
