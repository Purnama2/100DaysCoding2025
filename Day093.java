package main;

public class Day93 {
    public static void main(String[] args) {

        double angka1 = 4.1;
        double angka2 = 4.9;
        double angka3 = 4.5;

        // Contoh ceil()
        double hasilCeil = Math.ceil(angka1);

        // Contoh floor()
        double hasilFloor = Math.floor(angka2);

        // Contoh round()
        long hasilRound = Math.round(angka3);

        // Tampilkan hasil
        System.out.println("=== Contoh Pembulatan Angka ===");
        System.out.println("Angka asli (ceil)  : " + angka1);
        System.out.println("Math.ceil()        : " + hasilCeil);
        System.out.println();
        System.out.println("Angka asli (floor) : " + angka2);
        System.out.println("Math.floor()       : " + hasilFloor);
        System.out.println();
        System.out.println("Angka asli (round) : " + angka3);
        System.out.println("Math.round()       : " + hasilRound);
    }
}
