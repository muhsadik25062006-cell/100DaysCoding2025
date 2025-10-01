package Isc;
import java.util.Scanner;
public class Day24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double phi = 3.14;
        // Input jari-jari
        System.out.print(" jari-jari lingkaran: ");
        double r = in.nextDouble();
        
        // Hitung luas
        double luas = phi * r * r;
        
        // Output
        System.out.println("Luas lingkaran = " + luas);
    }
}
