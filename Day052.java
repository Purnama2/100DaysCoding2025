package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        int a = 1;
        int jumlah = 0;

        while (a <= angka) {
            jumlah += a;
            a++;
        }

        System.out.println("Jumlah = " + jumlah);
    }


    }
    
