package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan ukuran panjang: ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan ukuran lebar: ");
        int lebar = sc.nextInt();

        for (int i = 1; i <= panjang; i++) {
            for (int j = 1; j <= lebar; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
          }
