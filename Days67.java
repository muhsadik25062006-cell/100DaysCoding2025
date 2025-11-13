package coding100days;
import java.util.Scanner;
public class Harike67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan jumlah horizontal : ");
        int jumlah = in.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("-");
        }
        System.out.println(" ");
    }
}
