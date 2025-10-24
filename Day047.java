package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        System.out.print("Pilih hari: ");
        String hari = p.nextLine();
        
        switch (hari){
            case "senin":
                 System.out.println("anda memilih hari senin");
            break;
            case "selasa":
                 System.out.println("anda memilih hari selasa");
            break;
            case "rabu":
                 System.out.println("anda memilih hari rabu");
            break;
            case "kamis":
                 System.out.println("anda memilih hari kamis");
            break;
            case "jumat":
                 System.out.println("anda memilih hari jumat");
            break;
            case "sabtu":
                 System.out.println("anda memilih hari sabtu");
            break;
            case "minggu":
                 System.out.println("anda memilih hari minggi");
            break;
            default:
                 System.out.println("pilihan tidak valid")
            
        }
    }
    
                   }
