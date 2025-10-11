package Isc;
import java.util.Scanner;
public class Days35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" nilai : ");
        double ipk = in.nextInt();
        if(ipk >= 100){
            System.out.println("nilai salah");
        }else if( ipk >= 80 && ipk <= 100){
            System.out.println(" lulus");
        }else if( ipk <= 80){
            System.out.println(" tidak lulus ");
        }
    }
}
