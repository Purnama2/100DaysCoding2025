package main;

public class Day83 {
    public static void main(String[] args) {

        int[] a = {1, 3, 5, 6,7 };
        int b = 0;

        for (int i = 0; i < a.length; i++) {
            b += a[i];
        }
        System.out.println("hasil penjumlahan = " + b);
    }

}
