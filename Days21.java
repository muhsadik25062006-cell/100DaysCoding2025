package Isc;
public class Days21 {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;

        System.out.println("Sebelum ditukar: a = "+ a);
        System.out.println("Sebelim ditukar: b = "+ b);
        // Menukar tanpa variabel tambahan
        a = a + b;  // a = 15
        b = a - b;  // b = 5
        a = a - b;  // a = 10

        System.out.println("Sesudah ditukar: a = "+ a);
        System.out.println("Sesudah ditukar: b = "+ b);
    }
}
