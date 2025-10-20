package Day043;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner p = new Scanner (System.in);
    
        System.out.print("Masukkan Angka: ");
        int angka = p.nextInt();
        
        
        String angka1 = "";
        String ganjilgenap = "";
        String hasil = "";
        
        if (angka >0 ) {
            
        
        if (angka  >1 && angka < 10){
           angka1 = "adalah angka satuan ";
        }else if (angka >10 && angka <100){
            angka1 = " adalah angka puluhan ";
        }else if (angka > 100 && angka <1000 ){
            angka1 = " adalah angka ratusan ";   
        }

        if (angka %2 == 0){
            ganjilgenap = " genap ";
        }else{
            ganjilgenap = " ganjil ";
        }
        
         if (angka %3 == 0 && angka %5 ==0 ){
            hasil = " yang bisa di bagi 3 dan 5";
        }else if (angka %5 == 0){
            hasil = " yang bisa di bagi 5";
        }else if (angka %3==0) {
            hasil = " yang bisa di bagi 3";
        }else
            hasil =" tidak dapat dibagi 3 dan 5";
            
        
        System.out.println(angka + angka1 + ganjilgenap + hasil );
        }else{
            System.out.println("tidak boleh menampilkan angka negatif atau 0");
        }
}
}
