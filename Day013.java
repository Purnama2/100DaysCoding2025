package file3;

import java.util.Scanner;

public class java{
    public static void main(String[] args) { 
  // nomor  1
  
      //file 1
      //package evaluasiday13;

      //file 2
      //public class main {}

      //file 3
      //public static void main(String[] args) { }

// nomor 2

        // deklarasi variabel adalah membuat atau menentukan tipe data dan nama variabel 
        String a;
        int b ;
        byte c;
        short d;
        long e ;
        char f ;
        double g ;
        float h ;
        boolean i;
        
        //inisialisasi variabel untuk  menambahkan  nilai ke variabel yang sudah di deklaraikan
        a = "Purnama";
        b = 12;
        c = 5;
        d = 50;
        e = 100;
        f = 'P';
        g = 50.0;
        h = 12.0f;
        i = true;
        
        //update variabel adalah mengubah  nilai dari variabel yang awal atau yang sebelumnya
        a = "nama";
        b = 20;
        c = 10;
        d = 100;
        e = 1000;
        f = 'N';
        g = 55.0;
        h = 24.0f;
        i = false;
  // nomor 3
        Scanner input = new Scanner(System.in);
       //deklarasi
        String nama, nim, alamat;
        int umur;
        boolean status;
        double tinggiBadan, beratBadan;
        char kelas;
        
        //inisialisasi
        System.out.print("Nama:");
        nama = input.nextLine();
        System.out.print("Umur:");
        umur = input.nextInt();
        System.out.print("NIM:");
        nim = input.nextLine();
        nim = input.nextLine();
        System.out.print("Status:");
        status = input.nextBoolean();
        System.out.print("Tinggi Badan:");
        tinggiBadan = input.nextDouble();
        System.out.print("Berat Badan:");
        beratBadan = input.nextDouble();
        System.out.print("kelas:");
        kelas = input.next().charAt(0);
        System.out.print("Alamat:");
        alamat = input.next();
      
        
        // menentukan variabel
        System.out.print("===== Biodata Mahasiswa ====\n");
        System.out.print("Nama\t\t :\t"+nama);
        System.out.print("\nUmur\t\t :\t"+ umur+ " Tahun");
        System.out.print("\nNIM\t\t :\t"+ nim);
        System.out.print("\nStatus\t\t :\t"+status);
        System.out.print("\nTinggi Badan\t :\t"+ tinggiBadan +" cm");
        System.out.print("\nBerat Badan\t :\t"+ beratBadan +" kg");
        System.out.print("\nKelas\t\t :\t"+kelas);
        System.out.print("\nAlamat\t\t :\t"+ alamat+ "\n");
        
        
                
    }
    
}
