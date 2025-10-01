package Day024;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.print("masukkan angka: ");
        double  a = p.nextDouble();
        
        double luas = Math.PI * a * a;
        System.out.println("Luas Lingkaran = " + luas);
        
    }
    
}
