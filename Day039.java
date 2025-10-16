package Day039;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("=== menu Makanan ===");
        System.out.println("1.Nasi Goreng ");
        System.out.println("2.Nasi Campur ");
        System.out.println("3.Nasi Ayam Geprek ");
        System.out.println("=== menu Minuman ===");
        System.out.println("1. Es Teh");
        System.out.println("2. Es Jeruk");
        System.out.print("pilih menu makanan: ");
        int pilihan = input.nextInt();
        
        
        if (pilihan == 1) {
            System.out.println("Nasi Goreng");
            System.out.println("Harga 15000");   
        }else if (pilihan == 2) {
            System.out.println("Nasi Campur");
            System.out.println("Harga 15000");
        }else if (pilihan == 3) {
            System.out.println("Nasi Ayam Geprek");
            System.out.println("Harga 15000");
        }else{
            System.out.println("Pilihan tidak valid");
        }
        System.out.print("pilih menu minuman: ");
        int minuman = input.nextInt();
        if (minuman == 1) {
            System.out.println("es Teh");
            System.out.println("Harga 5000");
        }else if (minuman == 2) {
            System.out.println("Es Jeruk");
            System.out.println("10000");
        }else {
            System.out.println("pilihan tidak valid");
        }
            
    
                
    }
}
