package main;

public class Day78 {
    public static void main(String[] args) {
        String a = "  Saya Menyukai Kucing ";
        String cari = "Saya";
        String banding = "saya menyukai kucing";

        System.out.println( a );
        
        System.out.println("=== Hasil Manipulasi String ===");
        
        // lenght
        System.out.println("Jumlah karakter (length): " + a.length());
        
        //toUpperCase
        System.out.println("Huruf Kapital (toUpperCase): " + a.toUpperCase());
        
        //toLowerCase
        System.out.println("Huruf Kecil (toLowerCase): " + a.toLowerCase());
        
        //substring
        System.out.println("Substring(0-6): " + a.substring(0, 6));
        System.out.println("Replace spasi jadi '-': " + a.replace(" ", "-"));

        //trim 
        System.out.println("Trim : " + a.trim());
        
        //Contains
        System.out.println("Contains :"+ cari + " : "+ a.contains(cari));
        
        // membandingkan teks a dan teks banding menggunakan equals
        System.out.println("Equals dengan " + banding + ": " + a.equals(banding));
        
        //equels ignore case
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(banding));

        //isEmpty
        System.out.println("isEmpty: " + a.isEmpty());
    }
          }
