package main;

import java.util.Scanner;

public class Day098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai Fibonacci: ");
        int nilai = sc.nextInt(); 

        int a = 0, b = 1;
        
        for (int i = 1; i <= nilai; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}


