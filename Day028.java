package Day028;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.print("masukkan angka :");
        int a = p.nextInt();
        System.out.print("masukkan angka :");
        int b = p.nextInt();
        
        System.out.println(a == b);
        System.out.println(a != b);
    }
}
