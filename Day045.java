package Day045;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.println("masukkan pilihan prodi dari 1 - 3 : ");
        int angka = p.nextInt();
        
        switch(angka){
            case 1:
                System.out.println("Prodi: Informatika");
            break;
            case 2:
                System.out.println("Prodi: Sistem Informasi");
            break;
            case 3:
                System.out.println("Prodi: Sipil");
                break;
            default:
                System.out.println("Pilihan tidak valid atau pilihan tidak tersedia.");
        }
        
    }
}
