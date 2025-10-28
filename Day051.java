package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = p.nextInt();
        
        String hasil = "";
        
        for(int i = 1; i <= angka; i++){
            if(i %3 == 0 && i %5 == 0){
                hasil = "dapat  3 dan 5";
                System.out.println(i +" angka yang bisa dibagi 3 dan 5");
            }else if(i %5 == 0){
                hasil = "dapat di bagi 5";
                System.out.println(i +" angka yang bisa dibagi 5");
            }else if(i %3 == 0){ 
                hasil = "dapat di bagi 3";
                System.out.println(i +" angka yang bisa dibagi 3");
            }else{
                hasil= "tidak dapat di bagi 3 dan 5";
                System.out.println(i +" angka tidak dapat dibagi 3 dan 5");
            }
                
        }
        System.out.println("jadi angka "+ angka + " hasilnya "+hasil);
    }
    
        }
