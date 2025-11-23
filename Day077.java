package main;

public class Day077 {
    public static void main(String[] args) {
        
        String kalimat = "  Saya sangat menyukai kucing  ";
        
        // trim(): menghapus spasi di awal & akhir
        String kalimatTrim = kalimat.trim();
        System.out.println("Setelah trim: " + kalimatTrim);
        
        // substring(): mengambil sebagian string
        String hasilSubstring = kalimatTrim.substring(5, 12); // ambil kata "sangat"
        System.out.println("Hasil substring: " + hasilSubstring);
        
        // replace(): mengganti bagian teks
        String hasilReplace = kalimatTrim.replace("menyukai", "Menyayangi");
        System.out.println("Setelah replace: " + hasilReplace);

    }
          }
