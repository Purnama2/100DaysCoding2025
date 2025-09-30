package Day023;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        // program luas persegi panjang
        System.out.print("persegi :");
        int persegi = p.nextInt();
        System.out.print("panjang :");
        int panjang  = p.nextInt();
        
        int luas = persegi * panjang;
        
        System.out.println("luas persegi panjang adalah : "+luas);
    }
    
}
