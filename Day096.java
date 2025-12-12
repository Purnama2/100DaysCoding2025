package main;

public class Day096 {
    // Method non-void (mengembalikan nilai)
    static int tambah(int a, int b) {
        return a + b;
    }

    static int kurang(int a, int b) {
        return a - b;
    }

    static int kali(int a, int b) {
        return a * b;
    }

    static double bagi(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Penjumlahan : " + tambah(5, 5));
        System.out.println("Pengurangan : " + kurang(5, 5));
        System.out.println("Perkalian   : " + kali(5, 5));
        System.out.println("Pembagian   : " + bagi(5, 5));
        
    }
}
