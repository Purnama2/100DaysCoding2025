package Day016;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print(" a : ");
        int a = input.nextInt();
        System.out.print(" b :");
        int b = input.nextInt();
        

        System.out.println("Perkalian : "+ (a * b));
        System.out.println("Pembagian : "+ (a / b));
    }
}
