package Isc;
import java.util.Scanner;
public class Days49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" masukan nilai : ");
        int nilai = in.nextInt();
        String hasil = nilai >= 75 ? "lulus ":"tidak lulus ";
        System.out.println(" nilai : " + nilai);
        System.out.println(" keterangan : " + hasil);
    }
}
