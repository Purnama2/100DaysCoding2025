package main;

public class Day086 {
    public static void main(String[] args) {
        int[] angka = {10, 30, 50,201,55};
        int min = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] < min){
                min = angka[i];
            }
        }
        System.out.println("Nilai Minimal : "+min);
    }
    
}
