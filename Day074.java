package main;

import java.util.Scanner;

public class Day074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\n===== PROGRAM KALKULATOR =====");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilih = sc.nextInt();

            if (pilih >= 1 && pilih <= 4) {
                System.out.print("Masukkan angka pertama: ");
                int a = sc.nextInt();
                System.out.print("Masukkan angka kedua: ");
                int b = sc.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.println("Hasil dari pertambahan = " + (a + b));
                        break;
                    case 2:
                        System.out.println("Hasil dari pengurangan = " + (a - b));
                        break;
                    case 3:
                        System.out.println("Hasil dari perkalian = " + (a * b));
                        break;
                    case 4:
                            System.out.println("Hasil dari pembagian = " + (a / b));
                        break;
                }
            } else if (pilih == 5) {
                System.out.println("Program selesai");
            } else {
                System.out.println("Pilihan tidak valid!");
                break;
            }

        } while (pilih != 5);
    }
        }
