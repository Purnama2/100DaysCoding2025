package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();
        
        String sisabagi = (angka %2 == 0 )? "bilangan genap" : "bilangan ganjil";
        System.out.println(sisabagi);
    }
    
          }
