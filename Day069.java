package evaluasi.mentor.pkg3;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Jumlah karung: ");
        int jumlah = sc.nextInt();
        System.out.print("Berat per karung: ");
        int berat = sc.nextInt();
        
        int hasil = 0;
        
        hasil = jumlah * berat;
        
        System.out.println("Total berat: " + hasil);
    }
}
//package evaluasi.mentor.pkg3;
//import java.util.Scanner; 
// 
//public class soal4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        
//        System.out.print("Jumlah petak: ");
//        int jumlah = sc.nextInt();
//        int hasil = 0;
//        
//        for (int i = 1; i <= jumlah; i++) {
//            System.out.print("Jumlah petak Ke-"+ i+ ": ");
//            int petak = sc.nextInt();
//            
//            hasil += petak;
//        }
//            System.out.println("Total luas sawah: "+ hasil );
//    }
//}
