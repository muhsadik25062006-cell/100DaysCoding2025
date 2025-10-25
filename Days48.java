package Isc;
import java.util.Scanner;
public class Days48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" angka pertama \t\t: ");
        double p = in.nextDouble();
        System.out.print(" operasi (+, -, *, /) \t: ");
        char operasi = in.next().charAt(0);
        System.out.print(" angka kedua \t\t: ");
        double k = in.nextDouble();
        double hasil;
        switch(operasi){
            case '+':
            hasil = p + k;
            System.out.println(" hasil "+ hasil);
            break;
            case '-':
            hasil = p - k;
            System.out.println(" hasil "+ hasil);
            break;
            case '*':
            hasil = p * k;
            System.out.println(" hasil "+ hasil);
            break;
            case '/':
            hasil = p / k;
            System.out.println(" hasil "+ hasil);
            break;
            default:
            System.out.println(" operator yg anda masukan salah");
        }
    }
}
