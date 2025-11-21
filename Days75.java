package coding100days;
import java.util.Scanner;
public class harike75 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukan teks : ");
        String k = in.nextLine();
        System.out.println("Jumlah Karakterf\t: " + k.length());
        System.out.println("Huruf Kapital\t: " + k.toUpperCase());
        System.out.println("HUruf kecil\t: " + k.toLowerCase());

    }
}
