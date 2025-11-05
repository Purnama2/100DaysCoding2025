package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        System.out.println("\nAngka genap mulai dari 2 sampai " + n + ":");
        for (int i = 2; i <= n; i+=2) {
            System.out.print(i + " ");
            
        }

        System.out.println("\nAngka ganjil mulai dari 1 sampai " + n + ":");
        for (int i = 1; i <= n; i+=2) {
            System.out.print(i + " ");
            
        }
    }
}

    

                           
