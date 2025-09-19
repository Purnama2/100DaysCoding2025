package Day012;

public class main {
    public static void main(String[] args) {
        //deklarasi
        String nama, nim, alamat;
        int umur, berat;
        char kelas;
        double tinggi;
        
        //inisialisasi
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Nim :");
        nim = input.nextLine();
        System.out.print("Alamat :");
        alamat = input.nextLine();
        System.out.print("Umur :");
        umur = input.nextInt();
        System.out.print("Kelas :");
        kelas = input.next().charAt(0);
        System.out.print("Berat Badan :");
        berat = input.nextInt();
        System.out.print("Tinggi Badan :");
        tinggi = input.nextDouble();
        
        // menampilkan output
        System.out.println("Nama         : "+ nama);
        System.out.println("NIM          : "+ nim);
        System.out.println("Alamat       : "+ alamat);
        System.out.println("Umur         : "+ umur + " Tahun");
        System.out.println("Kelas        : "+ kelas + " Informatika");
        System.out.println("Berat Badan  : "+ berat);
        System.out.println("Tinggi Badan :" + tinggi);
                
        /*disini saya membuat biodata menggunakan Tipe Data String, Int, Char, double
        yang masing-masing saya gunakan untuk:
        - String untuk nama, nim, dan alamat
        - Int untuk umur dan kelas
        - char untuk kelas 
        - dauble untuk tinggi
        */
    }
    
}
