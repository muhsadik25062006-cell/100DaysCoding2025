package coding100days;
import java.util.Scanner;
public class harike81 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] nilai = {95, 90, 80, 88, 97};     
        System.out.print("Masukkan indeks : ");
        int i = in.nextInt();
        System.out.println("Nilai pada indeks " + i + " = " + nilai[i]);
    }
}
