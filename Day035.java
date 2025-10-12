package Day035;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        System.out.print("nama : ");
        String  nama  = p.nextLine();
        
        if (nama.equals("lilis") ) {
            System.out.println("nama saya adalah lilis ");
        }else
            System.out.println("salah");
    }
    
}
