package Day036;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("====== Jenis Buah  ======");
        
        System.out.println("1. Mangga");
        System.out.println("2. Jeruk");
      
        System.out.print("masukkan pilihan: ");
        int jenis = input.nextInt();
        int jenisBuah = 2;
        
        if (jenis  == 1) {
            System.out.println("1. Mangga madu");
            System.out.println("2. Mangga Panjang");
        }else if (jenisBuah  == 2){
            System.out.println("1. jeruk Bali (Pamelo)");
            System.out.println("2. Jeruk Siam  ");
      
        }
        
            System.out.println("==== Keterangan ====");
            System.out.print("masukkan pilihan : ");
            int nama = input.nextInt();
            int nama1 = 2;
        
            if (nama == 1) {
                System.out.println("Jenis Buah\t : Mangga Madu");
                System.out.println("Asal\t\t : Indonesi");
                System.out.println("Rasa\t\t : Sangat Manis");
                System.out.println("Jenis Buah\t : Mangga Panjang");
                System.out.println("Asal\t\t : Indonesi");
                System.out.println("Rasa\t\t : Manis segar");
            }else if (nama1 == 2){
                System.out.println("Jenis Buah\t : jeruk bali (pamelo)");
                System.out.println("Asal\t\t : Asia Tenggara");
                System.out.println("Rasa\t\t : Asam Segar");
                System.out.println("Jenis Buah\t : Jeruk Siam");
                System.out.println("Asal\t\t : Thailand/Indonesi");
                System.out.println("Rasa\t\t : Manis Asam dan Banyak air");
            }
       
    }
    
}
