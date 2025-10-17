package Isc;
import java.util.Scanner;
public class day40 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double a, b, hasil;
        char operasi;
        System.out.print("Masukkan angka pertama: ");
        a = input.nextInt();

        System.out.print("Masukkan operasi (+, -, *, /): ");
        operasi = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        b = input.nextInt();

        if (operasi == '+') {
            hasil = a + b;
            System.out.println("Hasil: " + hasil);
        } else if (operasi == '-') {
            hasil = a - b;
            System.out.println("Hasil: " + hasil);
        } else if (operasi == '*') {
            hasil = a * b;
            System.out.println("Hasil: " + hasil);
        } else if (operasi == '/') {
                hasil = a / b;
                System.out.println("Hasil: " + hasil);
            }else{
                System.out.println("\noperator tidak valid");
            }
        
    }
}
