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
        
        
        
        if (angka  >1 && angka < 10){
           angka1 = "satuan ";
        }else if (angka >10 && angka <100){
            angka1 = "puluhan ";
        }else if (angka > 100 && angka <1000 ){
            angka1 = "ratusan ";   
        }else{
            angka1 = "";
        }
            
  
 
        if (angka %2 == 0){
            ganjilgenap = "genap ";
        }else{
            ganjilgenap = "ganjil ";
        }
        
        
        
        
        if (angka %3 == 0 && angka %5==0){
            hasil = " yang bisa di bagi 3 dan 5";
        }else if (angka %3 == 0){
            hasil = " yang bisa di bagi 3";
        }else if (angka %5 == 0){
            hasil = " yang bisa di bagi 5";
        }else if (angka == 0) {
            hasil ="tidak dapat dibagi 3 dan 5";
        }else
            hasil = " tidak dapat di bagi 3 dan 5";
                 
        
        System.out.println(angka + " adalah angka "+angka1 + ganjilgenap + hasil );
}
}
