package coding100days;
import java.util.Scanner;
public class harike73 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int total = 0;
        int angka = 0;
        while (angka >= 0){
            System.out.print("Masukan angka : ");
            angka = in.nextInt();           
            if (angka >= 0) {
            total += angka;
            }
        }
        System.out.println("total angka = " + total);

    }
}
