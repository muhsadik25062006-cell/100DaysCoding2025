package Isc;
import java.util.Scanner;
public class harike61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai M: ");
        int M = input.nextInt();
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        System.out.println("\nBilangan kelipatan " + M + " dari 1 sampai " + N + ":");
        
        for (int i = 1; i <= N; i++) {
            String hasil = i % M == 0 ? i + " " : "";
            System.out.print(hasil);
        }

        System.out.println(" ");
    }
}
