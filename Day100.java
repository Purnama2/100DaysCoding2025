package main;

import java.util.Scanner;

public class Day100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine().toUpperCase();

        int status = 0;

        for (int i = 0; i < kata.length(); i++) {
            char a = kata.charAt(i);

            if (status == 0 && a == 'I') {
                status = 1;
            } else if (status == 1 && a == 'S') {
                status = 2;
            } else if (status == 2 && a == 'C') {
                status = 3;
                break;
            }
        }

        if (status == 3) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}


              
