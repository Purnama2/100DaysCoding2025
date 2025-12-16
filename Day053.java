package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        for (int i = 1; i <= angka; i++) {
            System.out.println("Perulangan ke-" + i);
            if (i == 10) {
                System.out.println("angka lebih besar dari 10 perulangan di hentikan ");
                break;
            }
            
        }
    }

    }
    
