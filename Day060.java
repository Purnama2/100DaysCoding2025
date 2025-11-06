package main;

import java.util.Scanner;

public class Day69 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukkan nilai N: ");
        int n = sc.nextInt();
        
        System.out.println("\nAngka genap mulai dari " + n + "sampai 2 :");
        for (int i = n; i >= 2; i--) {
            if(i % 2 == 0){
                System.out.print(i + " ");  
            }   
        }
        
        System.out.println("\nAngka ganjil mulai dari " + n + "sampai 1:");
        for (int i = n; i >= 1; i--) {
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
    
    }
