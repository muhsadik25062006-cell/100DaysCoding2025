package PemulaCoding;
import java.util.Scanner;
public class Ulng {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=====Menu minuman=====");
        System.out.println(" 1.Gula aren \n 2.Capucino \n 3.Jus");
        System.out.print(" pilihan : ");
        int pilihan = in.nextInt();
        switch(pilihan){
            case 1:
            System.out.println(" Kopi hitam - Rp. 5000");
            break;
            case 2:
            System.out.println(" Capucino - Rp.10000");
            break;
            case 3:
            System.out.println(" Jus - Rp.7000");
            break;
            default:
            System.out.println(" tidak ada menu");
            
        }
    }
}
