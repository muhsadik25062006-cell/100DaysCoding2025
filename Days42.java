package Isc;
import java.util.Scanner;
public class day42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pokok, tunjangan, potongan, bersih;
        
        System.out.print("Gaji pokok: ");
        pokok = in.nextInt();
        
        System.out.print("Tunjangan: ");
        tunjangan = in.nextInt();
        
        System.out.print("Potongan: ");
        potongan = in.nextInt();

        bersih = (pokok + tunjangan) - potongan;

        System.out.println("Gaji Bersih: Rp" + bersih);
    }
}
