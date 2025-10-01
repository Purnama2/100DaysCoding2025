package Day024;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        final double a = 3.14;
        System.out.print("masukkan angka: ");
        double  b = p.nextDouble();
         
        
        double luas = a * b * b;
        System.out.println("Luas Lingkaran = " + luas);
        
    }
    
}
