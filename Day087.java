package main;

import java.util.Scanner;

public class Day067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = {3, 7, 9, 12, 15, 20};
        
        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = sc.nextInt();

        boolean ditemukan = false;
        int posisi = -1;

        // Melakukan pencarian
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                posisi = i;
                break;
            }
        }

        // Menampilkan hasil
        if (ditemukan) {
            System.out.println("Angka " + cari + " ditemukan pada indeks ke-" + posisi);
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan di dalam array.");
        }
    }
    }
