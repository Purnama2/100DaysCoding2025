package Day041;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        // soal 1
        System.out.print("Masukkan suhu dalam celcius: ");
        double  suhu = p.nextInt();
        
        System.out.println("Pilih Konversi: ");
        System.out.println("1. Fahrenheit ");
        System.out.println("2. Kelvin ");
        
        System.out.print("Masukkan pilihan anda: ");
        int celsius = p.nextInt();
        
        if (celsius  ==1  ) {
            final double celsiuss = suhu * 9 / 5 + 32;
            System.out.println("Hasil Konversi: 25.0C = " + celsiuss + "F");
        }else if (celsius == 2) {
            final double celsiuss  = suhu + 273.15;
            System.out.println("Hasil Konversi: 25.0C = " + celsiuss + " K");
        }
        // soal 2
        
//        System.out.print("Username: ");
//        String username = p.nextLine();
//        
//        System.out.print("Password: ");
//        String password = p.nextLine();
//        
//        if (username.equals("PURNAMA") && password.equals("7")) {
//            System.out.println("Anda login sebagai pengguna");
//        }else if (username.equals("admin")&& password.equals("admin")) {
//            System.out.println("Anda login sebagai admin");
//        }else{
//            System.out.println("Anda tidak ditemukan");
//    }
    }
    
}
