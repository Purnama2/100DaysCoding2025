package Day015;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Pertambahan :");
        int a = input.nextInt();
        System.out.print("pengurangan :");
        int b = input.nextInt();
        
        int hasil = a + b;
        int hasil2 = a - b;
        
        System.out.println("Pertambahan : "+ hasil);
        System.out.println("Pengurangan : "+ hasil2);
                                
    }
    
}
