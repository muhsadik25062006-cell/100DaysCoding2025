package PemulaCoding ;
import java.util.Scanner;
public class Harike4 {
    
    public static void main(String[] args) {
        Scanner menyusun = new Scanner(System.in);
        String halo;
        String perkenalkan;
        String nama;
        String alamat;
        int umur;
        System.out.print("halo \t\t: ");
        halo = menyusun.nextLine();
        System.out.print("Perkenalkan \t: ");
        perkenalkan = menyusun.nextLine();
        System.out.print("nama \t\t: ");
        nama = menyusun.nextLine();
        System.out.print("alamat \t\t: ");
        alamat = menyusun.nextLine();
        System.out.print("umur \t\t: ");
        umur = menyusun.nextInt();
        System.out.println("================");
        System.out.println("halo "+halo);
        System.out.println("Perkenalkan " + perkenalkan);
        System.out.println(nama + " Dari " + alamat);
        System.out.println("Berumur "+umur+" tahun");
    } 
    
}
