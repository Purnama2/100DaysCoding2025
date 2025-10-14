package Day037;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.print("masukkan angka: ");
        int a = p.nextInt();
        System.out.print("masukkan angka: ");
        int b = p.nextInt();
        System.out.print("masukkan angka: ");
        int c = p.nextInt();
        
        if (a %2 == 0) {
            System.out.println(a +" angka genap");
        }else {
            System.out.println(a +" angka ganjil");
        }
        
        if (b %2 == 0) {
            System.out.println(b +" angka genap");
        }else {
            System.out.println(b +" angka ganjil");
        }
        
        if (c %2 == 0) {
            System.out.println(c +" angka genap");
        }else {
            System.out.println(c +" angka ganji");
        }
        
 
    }


    }
    

         
