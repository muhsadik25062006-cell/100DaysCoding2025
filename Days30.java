package Isc;
import java.util.Scanner;
public class Day30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.print(" a : ");
        a = in.nextInt();
        System.out.print(" b : ");
        b = in.nextInt();
        
        System.out.println("Apakah a >= b? " + (a >= b));
        System.out.println("Apakah a <= b? " + (a <= b));
    }
}
