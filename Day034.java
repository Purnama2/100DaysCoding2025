package Day34;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.print("masukkan angka :");
        int a = p.nextInt();
        
        a -= 4; // operator penugasan
        System.out.println(a + a * a  ); // operator aritmatika
        System.out.println((a % 2 == 0)); // operator aritmatika dan perbandingan
        System.out.println(a + a * a < 10 ); // operator aritmatika dan perbandingan     
        System.out.println((a + a * a > 10) || (a % 2 == 0)); //operator aritmatika, perbandingan dan logika
         }
    
}   
