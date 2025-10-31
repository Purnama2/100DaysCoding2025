package main;

import java.util.Scanner;

public class lll {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Mahasiswa: ");
        int jumlah = sc.nextInt();

        int totalNilaiValid = 0;
        int jumlahNilaiValid = 0;
        int jumlahTidakValid = 0;
        int nilaiTerbesar = 0;
        int nilaiTerkecil = 100;
        double rataRata = 0;
        

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            int nilai = sc.nextInt();

            if (nilai <= 1 || nilai >=100) {
                System.out.println("Nilai tidak valid dan tidak dapat diproses");
                jumlahTidakValid++;
                continue;
            }
            
                totalNilaiValid += nilai;
                jumlahNilaiValid++;

                if (nilai > nilaiTerbesar) {
                    nilaiTerbesar = nilai;
                }

                if (nilai < nilaiTerkecil) {
                    nilaiTerkecil = nilai;
                }
            
        }

        if (jumlahNilaiValid > 0) {
            rataRata = (double)totalNilaiValid / jumlahNilaiValid;
        }

        System.out.println("\n=== Hasil ===");
        System.out.println("Total nilai valid: " + totalNilaiValid);
        System.out.println("Jumlah nilai valid: " + jumlahNilaiValid);
        System.out.println("Jumlah nilai tidak valid: " + jumlahTidakValid);
        System.out.println("Nilai valid terkecil: " + nilaiTerkecil);
        System.out.println("Nilai valid terbesar: " + nilaiTerbesar);
        System.out.println("Rata-rata nilai valid: " + rataRata);

        
    }
}
