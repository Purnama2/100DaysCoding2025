package main;

import java.util.Scanner;

public class Day076 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama1 = input.nextLine();
        
        System.out.print("Masukkan nama: ");
        String nama2 = input.nextLine();
        
        // Mengecek apakah nama1 kosong
        if (nama1.isEmpty()) {
            System.out.println("Nama kosong!");
        } else {
            System.out.println("Nama tidak kosong.");
        }
        
        // Mengecek kesamaan String
        if (nama1.equals(nama2)) {
            System.out.println("Nama sama.");
        } else if (nama1.equalsIgnoreCase(nama2)) {
            System.out.println("Nama sama tapi beda huruf");
        } else {
            System.out.println("nama berbeda.");
        }
        
        // Mengecek apakah nama1 mengandung nama2
        if (nama1.contains(nama2)) {
            System.out.println("nama pertama mengandung nama kedua.");
        } else {
            System.out.println("nama pertama tidak mengandung teks kedua.");
        }
        
        input.close();
    }
  }
