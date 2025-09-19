package Isc;
import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Nama, Nim;
        int Umur;
        float Tinggi;
        String Hobi;
        
        System.out.print("Nama \t: ");
        Nama = input.nextLine();
        System.out.print("Nim \t: ");
        Nim = input.nextLine();
        System.out.print("Hobi \t: ");
        Hobi = input.nextLine();
        System.out.print("Umur \t: ");
        Umur = input.nextInt();
        System.out.print("Tinggi \t: ");
        Tinggi = input.nextFloat();
        
        
        System.out.println("==================");
        System.out.println("Nama : " + Nama);
        System.out.println("Nim : " + Nim);
        System.out.println("Umur : " + Umur);
        System.out.println("Tinggi : " + Tinggi);
        System.out.println("Hobi : " + Hobi);
        
        
    }
    
}
