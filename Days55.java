package coding100days;
import java.util.Scanner;
public class harike55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nilai : ");
        int nilai = in.nextInt();
        String hasil = nilai > 70 ? "Ujian Kroco Ji Pale":"Sa Jappo,ka Aih";
        System.out.println(hasil);
    }
}
