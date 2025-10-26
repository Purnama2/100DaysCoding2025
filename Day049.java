package day049;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        System.out.println("Masukkan suhu :");
        int suhu = p.nextInt();
        
        String kondisi = (suhu >=30) ? "panas" : "dingin";
            
        System.out.println("cuaca hari ini: " + kondisi);
    
    } 
}
