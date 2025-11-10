package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai M: ");
        int m = sc.nextInt();
        System.out.print("masukkan nilai N: ");
        int n = sc.nextInt();
        
        int hasil = 1;
        
        for(int i = 1; i <=n; i++ ){
            hasil *= m;
            
        }
        System.out.println("hasil dari " + n + " pangkat " + m + " adalah " + hasil);
    }
    
}
