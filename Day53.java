package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("===== MANU MAKANAN =====");
        System.out.println("1. Nasi Goreng 15/porsi");
        System.out.println("2. Mie Goreng 12/porsi");
        System.out.println("3. Gado-Gado 10/porsi");
        
        System.out.print("Masukkan pilihan: ");
        int angka = sc.nextInt();
        System.out.print("Jumlah Porsi: ");
        int jumlah = sc.nextInt();
        
        int harga = 0;
        
        switch (angka){
            case 1:
                   harga = 15000;
                   harga *= jumlah;
                   System.out.println("Anda memilih Nasi Goreng dengan porsi "+ jumlah + ". Semua total pembayaran Rp"+harga);
            break;
            case 2:
                   harga = 12000;
                   harga *= jumlah;
                   System.out.println("Anda memilih Mie Goreng dengan porsi "+ jumlah + ". Semua total pembayaran Rp"+harga);
            break;
            case 3:
                   harga = 10000;
                   harga *= jumlah;
                   System.out.println("Anda memilih Gado-Gado dengan porsi "+ jumlah + ". Semua total pembayaran Rp"+harga);
            break;
            default: 
                   System.out.println(" Pilihan tidak valid");
             
        }
    }
    
  }
