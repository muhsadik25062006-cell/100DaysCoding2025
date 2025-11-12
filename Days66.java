package coding100days;
import java.util.Scanner;
public class hari66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan tinggi : ");
        int tinggi = in.nextInt();
        for (int i = 0; i < tinggi; i++) {
            System.out.println("*");
        }
    }
}
