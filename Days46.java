package Isc;
import java.util.Scanner;
public class Days46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("====menu makanan====");
        System.out.println(" 1.Nasi goreng \n 2.Ayam bakar \n 3.Bakso");
        System.out.print(" pilihan : ");
        int pilihan = in.nextInt();
        switch(pilihan){
            case 1:
            System.out.println(" Nasi goreng (13k/porsi) ");
            break;
            case 2:
            System.out.println(" Ayam bakar (15k/porsi) ");
            break;
            case 3:
            System.out.println(" Bakso (12/porsi) ");
            break;
            default:
            System.out.println(" pilihan salah ");
        }
        
    }
}
