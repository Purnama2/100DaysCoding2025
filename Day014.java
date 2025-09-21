package Day014;

public class main {
    public static void main(String[] args) {
        //deklarasi
        String a = "5";
        String ab = "P";
        
        //inisialisasi
        int b = Integer.parseInt(a);
        byte c = Byte.parseByte(a);
        short d = Short.parseShort(a);
        long e = Long.parseLong(a);
        double f = Double.parseDouble(a);
        float g = Float.parseFloat(a);
        char h = ab.charAt(0);
        boolean i = Boolean.parseBoolean(a);
        
        //menampilkan input
        System.out.println("a\t: "+ b);
        System.out.println("b\t: "+c);
        System.out.println("c\t: "+d);
        System.out.println("e\t: "+e);
        System.out.println("f\t: "+f);
        System.out.println("g\t: "+g);
        System.out.println("h\t: "+h);
        System.out.println("i\t: "+i);
        
        
        /* Disini saya mengubah String ke semua tipe data primitif contohnya
           int, byte, short, long, double, float, char, dan boolean. Menggunakan 
           metode perse atau charAt(0).
        
        */
         
    }
}
