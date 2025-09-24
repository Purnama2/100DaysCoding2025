package Day017;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print(" masukkan angka a :");
        int a = input.nextInt();
        System.out.print(" masukkan angka b :");
        int b = input.nextInt();
        
        System.out.println("Modulus : "+ (a % b));
                
    }
    
}
