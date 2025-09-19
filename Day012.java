package Day012;

public class main {
    public static void main(String[] args) {
        //deklarasi
        String nama, nim, alamat;
        int umur, berat;
        char kelas;
        double tinggi;
        
        //inisialisasi
        nama = "Purnama";
        nim = "D0225027";
        umur = 18;
        kelas = 'C';
        alamat = "Polewali Mandar";
        tinggi = 150.0;
        berat = 45;
        
        // menampilkan output
        System.out.println("Nama         : "+ nama);
        System.out.println("NIM          : "+ nim);
        System.out.println("Umur         : "+ umur);
        System.out.println("Kelas        : "+ kelas + " Informatika");
        System.out.println("Alamat       : "+ alamat);
        System.out.println("Tinggi Badan : "+ tinggi);
        System.out.println("Berat Badan  :" + berat);
                
        /*disini saya membuat biodata menggunakan Tipe Data String, Int, Char, double
        yang masing-masing saya gunakan untuk:
        - String untuk nama, nim, dan alamat
        - Int untuk umur dan kelas
        - char untuk kelas 
        - dauble untuk tinggi
        */
    }
    
}
