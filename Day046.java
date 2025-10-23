package main;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        System.out.println("===== MENU KOPI =====");
        System.out.println("1. Latte \n2. Americano \n3. Cappucino");
        System.out.print("Pilih Menu: ");
        int menu = p.nextInt();
        
        System.out.print("Jumlah porsi: ");
        int porsi =p.nextInt();
        
        int harga = 0;
        
        switch (menu){
            case 1 :
            harga = 15000;
            System.out.println("Anda memilih Latte 15/porsi. Semua total harga Rp." + harga*porsi);
            break;
            case 2 :
            harga = 10000;
            System.out.println("Anda memilih Americano 10/porsi. Semua total harga Rp." + harga*porsi);
            break;
            case 3 :
            harga = 15000;
            System.out.println("Anda memilih Cappucino 15/porsi. Semua total harga Rp." + harga*porsi);
            break;
            default:
            System.out.println("pilihan tidak valid.");
            
        }
    }
    
                           }
