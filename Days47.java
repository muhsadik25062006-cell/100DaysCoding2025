package Isc;
import java.util.Scanner;
public class Days47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Nama Nama Hari===");
        System.out.println(" 1.Senin \n 2.Selasa \n 3.Rabu \n 4.Kamis \n 5.Jumat \n 6.Sabtu \n 7.Minggu");
        System.out.print(" Pilihan : "); 
        int pilihan = in.nextInt();
        switch(pilihan){
            case 1:
            System.out.println(" Hari Senin");
            break;
            case 2:
            System.out.println(" Hari Selasa");
            break;
            case 3:
            System.out.println(" Hari Rabu");
            break;
            case 4:
            System.out.println(" Hari Kamis");
            break;
            case 5:
            System.out.println(" Hari Jumat");
            break;
            case 6:
            System.out.println(" Hari Sabtu");
            break;
            case 7:
            System.out.println(" Hari Minggu");
            break;
            default:
            System.out.println(" Pilihan salah pilihan harus 1 - 7");
        }
    }
              }
