package PemulaCoding;
import java.util.Scanner;
public class Evaluasi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        int b;
        System.out.print("Nama :");
        a = in.nextLine();
        System.out.print("umur :");
        b = in.nextInt();
        
        System.out.println(" nama saya "+ a);
        System.out.print(" umur saya adalah "+ b + "tahun\n");
        System.out.printf(" umur saya 5 tahun kedepan adalah %d ",(b+5));
    }
}
