package Day045;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.print("masukkan pilihan prodi dari 1 dan 2 menggunakan true/false: ");
        boolean angka = p.nextBoolean();
        int angka2 = (angka)? 1 : 2;
      
        switch(angka2){
            case 1:
                System.out.println("Prodi: Informatika");
            break;
            case 2:
                System.out.println("Prodi: Sistem Informasi");
            
        }
        
    }
}
