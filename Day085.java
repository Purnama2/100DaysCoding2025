package main;

public class Day085 {
    public static void main(String[] args) {

        int[] angka = {10, 50, 35, 47, 29};

        int max = angka[0];

        // cari nilai maksimal
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }

        System.out.println("Nilai maksimal dalam array adalah: " + max);
    }
}
