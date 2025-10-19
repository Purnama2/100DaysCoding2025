package Day042;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        System.out.println("============ input ============");
        System.out.print("Nama Pengawai: ");
        String nama = p.nextLine();
        
        System.out.println("======= Pekerjaan =======");
        System.out.println("1. PNS \n2. Freelancer \n ============================");
        
        System.out.print("Pilih Pekerjaan: ");
        int pekerjaan = p.nextInt();
        
        System.out.print("Pengahasilan: ");
        int hasil = p.nextInt();
        
        String kerja = "";
        int pajak = 0;
        
        if (pekerjaan == 1) {
            kerja = "PNS";
            if (hasil >= 5000000) {
                pajak = 15 ;  
            }else if (hasil >= 3000000 && hasil < 5000000 ) {
                 pajak = 10;
            }else  {
                pajak = 0;
            }
        }else if (hasil == 2) {
            kerja = "Freelancer";
            if (hasil >= 5000000) {
                pajak = 8 ;  
            }else if (hasil >= 3000000 && hasil < 5000000 ) {
                 pajak = 3;
            }else  {
                pajak = 0;
            }
            
           
        }else{
            System.out.println("hasil tidak ditemukan");
        }
            
        
        
        double  potongan = hasil * pajak;
        double hasilakhir = hasil - potongan;
        System.out.println("============ output ============");
        System.out.println("Nama Pegawai\t\t:" + nama);
        System.out.println("Jenis Pekerjaan\t\t:" + pekerjaan);
        System.out.println("Penghasilan Kotor\t: Rp" + hasil);
        System.out.println("Pajak DIkenakan\t\t:"+ pajak + "%");
        System.out.println("Potongan\t\t:"+ potongan );
        System.out.println("Penghasilan Bersih\t:" + hasilakhir);
    }
}
