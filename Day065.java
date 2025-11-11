package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i; 
        }

        System.out.println("Faktorial dari " + n + " adalah: " + hasil);
    }
    
}
