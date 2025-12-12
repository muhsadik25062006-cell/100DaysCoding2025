package coding100days;
import java.util.Scanner;
public class harike97 {
    static int tambah(int a, int b) {
        return a + b;  
    }
    static int kurang(int a, int b) {
        return a - b;
    }
    static int kali(int a, int b) {
        return a * b;
    }
    static double bagi(int a, int b) {
        return (double) a / b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukan angka pertama : ");
        int a = in.nextInt();
        System.out.print("Masukan angka kedua : ");
        int b = in.nextInt();
        
        System.out.println("\n===============Hasil================\n");
        
        System.out.println("Hasil penjumlahan : " +tambah(a, b));
        System.out.println("Hasil pengurangan : " + kurang(a, b));
        System.out.println("Hasil perkalian : " + kali(a, b));
        System.out.println("Hasil Pembagian : " + bagi(a, b));
        
    }
}
