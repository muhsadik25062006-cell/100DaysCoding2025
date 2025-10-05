package Isc;
import java.util.Scanner;
public class Day28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y;
        System.out.print("Masukkan nilai x: ");
        x = in.nextInt();
        System.out.print("Masukkan nilai y: ");
        y = in.nextInt();
        
        System.out.println("Apakah x == y? " + (x == y));
        System.out.println("Apakah x != y? " + (x != y));
    }
}
