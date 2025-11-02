package Day056;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int i = 1, jumlah = 0;

        System.out.print("Masukkan angka: ");
        int a = sc.nextInt();

        do {
            jumlah += i;  
            i++;          
        } while (i <= a);

        System.out.println("Jumlah angka 1 sampai " + a + " adalah " + jumlah);
    

  
    }
    
                 }
