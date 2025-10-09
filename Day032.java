package Day032;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.print("masukkan angka :");
        int a = p.nextInt();
        
        System.out.println( a < 15 || a > 15 );
    }
    
}
