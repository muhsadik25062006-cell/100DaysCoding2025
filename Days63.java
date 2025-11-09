package coding100days;
import java.util.Scanner;
public class harike63 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukan N : ");
        int N = in.nextInt();
        int total = 1;
        for (int i = 1; i <= N; i++) {
            total *= i;
        }
        System.out.println("jumlah dari 1 sampai " + N + " adalah : " + total);
    }
}
