package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i; 
        }

        System.out.println("Hasil penjumlahan dari 1 sampai " + n + " adalah: " + jumlah);

    }
    
}
