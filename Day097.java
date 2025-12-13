package main ;

import java.util.Scanner;

public class Day097 {
    // Method non-void dengan parameter
    static int hitungLuas(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = sc.nextInt();

        int luas = hitungLuas(sisi);

        System.out.println("Luas persegi adalah: " + luas);
    }
}

          
