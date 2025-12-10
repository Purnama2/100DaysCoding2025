package main;

import java.util.Scanner;

public class Day094 {
    static void cetakNama(String nama) {
        System.out.println("Halo, " + nama);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nama: ");
        String nama = sc.nextLine();
        cetakNama(nama);    
    }
}

