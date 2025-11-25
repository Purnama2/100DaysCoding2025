package Day079;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan Username: ");
            String user = sc.nextLine();
            System.out.print("Masukkan password: ");
            String pw = sc.nextLine();
            
            if (user.equals("Purnama") && pw.equals("p1234")) {
                System.out.println("\nLogin sudah berhasil");
                break;
            }else if(!user.equals("Purnama")|| !pw.equals("p1234")){
                System.out.println("Login gagal");
            }

        }
    }

}
