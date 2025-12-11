package main;

import java.util.Scanner;

public class Day095 {
    static void pesan(String pesan1) {
        System.out.println("Pesan: " + pesan1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan kata: ");
        String nama = sc.nextLine();
        pesan(nama);     
    }
}

