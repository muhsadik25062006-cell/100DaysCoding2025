package coding100days;
import java.util.Scanner;
public class Harike68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan ukuran pola persegi: ");
        int p = in.nextInt();
        
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= p; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}
