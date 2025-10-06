package Isc;
import java.util.Scanner;
public class day29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print(" a : "); 
        a = in.nextInt();
        System.out.print(" b : "); 
        b = in.nextInt();

        System.out.println(a > b); 
        System.out.println(a < b); 
    }
}
