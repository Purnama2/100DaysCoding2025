package Day040;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.print("masukkan angka untuk nilai a: ");
        int a = p.nextInt();
        System.out.print("masukkan angka untuk nilai b: ");
        int b = p.nextInt();
        
        System.out.println("1. tambah (+)");
        System.out.println("2. kurang (-)");
        System.out.println("3. kali (*)");
        System.out.println("4. bagi (/)");
        System.out.println("5. modulus (%)");
        
        System.out.print("masukkan simbol aritmatika: ");
        int angka = p.nextInt();
        
        if (angka == 1) {
            System.out.println(a + b);
            System.out.println("maka hasil dari pertambahan di atas adalah "+ (a + b));
        }else if (angka == 2) {
            System.out.println(a - b);
            System.out.println("maka hasil dari pengurangan di atas adalah "+ (a - b));
        }else if (angka == 3) {
            System.out.println(a * b);
            System.out.println("maka hasil dari perkalian di atas adalah "+ (a * b));
        }else if (angka == 4) {
            System.out.println(a / b);
            System.out.println("maka hasil dari pembagian di atas adalah "+ (a / b));
        }else if (angka == 5) {
            System.out.println(a % b);
            System.out.println("maka hasil dari modulus atau sisa bagi di atas adalah "+ (a % b));
        }else{
            System.out.println("hasil tidak valid");
        }
            
        
    }
    
}
