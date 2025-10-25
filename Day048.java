package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();
        
        System.out.print("Masukkan operator: ");
        char operator = p.next().charAt(0);
        
        System.out.print("Masukkan angka2: ");
        int angka2 = p.nextInt();
        
        int hasil = 0;
        
        switch(operator){
            case '+' :
                 hasil = angka + angka2;
                 System.out.println("hasil pertambahan = "+ hasil );
            break;
            case '-' :
                 hasil = angka - angka2;
                 System.out.println("hasil pengurangan = "+ hasil );
            break;
            case '*' :
                 hasil = angka * angka2;
                 System.out.println("hasil perkalian = " +hasil);
            break;
            case '/' :
                 hasil = angka / angka2;
                 System.out.println("hasil pembagian = " +hasil);
            break;
            case '%' :
                 hasil = angka % angka2;
                 System.out.println("hasil modulus/sisa bagi = " );
            break;
            default:
                 System.out.println("hasil tidak di temukan");
            
                
        }
        
        
    }
    
          }
