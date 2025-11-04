package coding100days;
import java.util.Scanner;
public class harike59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = in.nextInt();
        System.out.print("Angka ganjil : ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nAngka genap : ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }
}
