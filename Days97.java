package coding100days;
import java.util.Scanner;
public class harike97 {
    public static int hitungLuas(int s) {
    int Luas;
        Luas = s * s;
        System.out.println("Luas Persegi = " + Luas);
        return Luas;   
    }  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan sisi : ");
        int a = in.nextInt();

        hitungLuas(a);      
    }
}
