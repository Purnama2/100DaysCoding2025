package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.print("Masukkan batas perkalian: ");
        int batas = p.nextInt();

        for (int i = 1; i <= batas; i++) {
            for (int j = 1; j <= batas; j++) {
                System.out.print(i * j + "\t");
            }
            
        }
    }

    
    
}
