package Day022;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.print("masukkan angka :");
        double sisi = p.nextDouble();
        
        double luas = sisi*sisi;
        System.out.println("luas persegi adalah:"+ luas);
    }
}
