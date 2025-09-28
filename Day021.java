package Day021;

public class main {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        
        // proses penukaran tanpa variabel tambahan 
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a ="+ a);
        System.out.println("b ="+ b);
                
        
        // proses penukaran dengan satu variabel tambahan
        int d = 10;
        int e = 25;
        int f = d;
        d = e;
        e = f;
        System.out.println("d ="+ d);
        System.out.println("e ="+ e);
    }
    
}

