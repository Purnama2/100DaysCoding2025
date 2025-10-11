package Day34;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.print("nilai a:");
        int a = p.nextInt();
        System.out.print("nilai b:");
        int b = p.nextInt();
        System.out.print("nilai c:");
        int c = p.nextInt();
        
        int d = a + (b * c);
        System.out.println("Nilai akhir a = " + d);
        System.out.println("Hasil akhir   = " + (d %2 == 0 && d / b > c|| d <= 10));
        
        
         }
    
}   
