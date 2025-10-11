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
        
        int nilai  = a + (b * c);
        System.out.println("Nilai akhir a = " + nilai);
        boolean hasil = nilai %2 == 0 && nilai / b > c|| nilai <= 10;
        System.out.println("Hasil logika = " + hasil  );
        
        
         }
    
}   
        
