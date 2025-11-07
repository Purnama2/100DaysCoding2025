package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();
        
        System.out.print("Masukkan nilai M (kelipatan): ");
        int m = sc.nextInt();
        
        System.out.println("\nBilangan kelipatan " + m + " dari 1 sampai " + n + " adalah:");
        
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {  
                System.out.print(i + " ");
            }
        }
    }

    }

      
