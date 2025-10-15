package Day038;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angka: ");
        int angka = input.nextInt();
        
        if (angka > 0 ) {
            System.out.println("angka "+ angka + " adalah bilangan  positif");
            System.out.println("contoh lain 1, 2, 3, 100, 1000.");
        }else if (angka < 0){
            System.out.println("angka "+angka +" adalah bilangan negatif");
            System.out.println("contoh lain -1, -2, -3, -100, 1000.");
        }else{
            System.out.println("angka "+ angka + " adalah bilangan nol");
            System.out.println("nol bukan bilangan positif maupun negatif");
    }
    }
}
