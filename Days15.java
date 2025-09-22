package PemulaCoding;
import java.util.Scanner;
public class Dayfive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();
        
        int hasilTambah = a + b;
        int hasilKurang = a - b;
        
        System.out.println("Hasil Penjumlahan: " + hasilTambah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
    }
}
