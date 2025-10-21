package Day044;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.println("masukkan nilai");
        int nilai = p.nextInt();
        
        if (nilai <= 1 || nilai >= 100) {
            System.out.println("nilai tidak valid");
        }else if (nilai >= 85) {
            System.out.println("Nilai A");
        }else if (nilai >= 75) {
            System.out.println("Nilai B");
        }else if (nilai >= 65) {
            System.out.println("Nilai C");
        }else if (nilai >= 50) {
            System.out.println("Nilai D");
        }else {
            System.out.println("Nilai E");
        }
            
    }
    
}
