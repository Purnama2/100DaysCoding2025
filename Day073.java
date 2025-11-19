package main;

import java.util.Scanner;

public class Day073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int angka;

        while (true) {
            System.out.print("Masukkan angka: ");
            angka = sc.nextInt();
            if (angka < 0){
                System.out.println("angka negatif program diberhentikan");
                break;
            }
            total += angka;
            
        }

        System.out.println("Total jumlah = " + total);
    }

}
