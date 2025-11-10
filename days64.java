package coding100days;
import java.util.Scanner;
public class harik64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nilai M : ");
        int nilai_m = in.nextInt();
        System.out.print("Masukkan nilai pangkat N : ");
        int pangkat = in.nextInt();

        int total = 1;
        for (int i = 1; i <= pangkat; i++) {
            total *= nilai_m;
        }
        System.out.println(nilai_m + " pangkat " + pangkat + " adalah : " + total);
    }
}
