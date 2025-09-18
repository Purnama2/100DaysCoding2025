package Day011;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //deklarasi 
        String nama;
        char a;
        int umur;
        short tinggi;
        float berat;
        long ukuran;
        byte punya;
        double nilai;
        boolean lulus;
                
                
        
        //inisialisasi
        System.out.print("nama : ");
        nama = input.nextLine();
        System.out.print("Char :");
        a = input.next().charAt(0);
        System.out.print("Umur : ");
        umur = input.nextInt();
        System.out.print("Tinggi Badan : ");
        tinggi = input.nextShort();
        System.out.print("Berat Badan : ");
        berat = input.nextByte();
        System.out.print("Ukuran Sepatu :");
        ukuran = input.nextLong();
        System.out.print("Punya Kucing :");
        punya = input.nextByte();
        System.out.print("Nilai:");
        nilai = input.nextDouble();
        System.out.print("lulus:");
        lulus =input.nextBoolean();
        
        
        //menampilkan output
        System.out.println("Nama : "+ nama);
        System.out.println("Inisial :"+a );
        System.out.println("Umur :"+ umur);
        System.out.println("Tinggi Badan : "+ tinggi);
        System.out.println("Berat Badan "+ berat);
        System.out.println("Ukuran Sepatu :"+ ukuran);
        System.out.println("Punya Kucing :"+ punya);
        System.out.println("Nilai :"+ nilai);
        System.out.println("Lulus :"+ lulus);
        
        /* Scanner adalah kelas yang digunakan untuk membaca input dari pengguna 
        atau sumber lain.
        */
        
                
    }
}
