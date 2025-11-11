package Isc;
import java.util.Scanner;
public class Day65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        int total = 1;
        for (int i = 1; i <= angka; i++) {
            total *= i;
        }
        System.out.println("Faktorial dari " + angka + " adalah : " + total);
    }
}
