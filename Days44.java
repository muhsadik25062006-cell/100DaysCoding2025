package Isc;
import java.util.Scanner;
public class Days44 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Angka : ");
        int angka = in.nextInt();
        char predikat;
        if ( angka >= 90){
            predikat = 'A';
        }else if( angka >= 80){
            predikat = 'B';
        }else if( angka >= 70){
            predikat = 'C';
        }else if( angka >= 60){
            predikat = 'D';
        }else{
            predikat = 'E';
        }
        System.out.println(" angka : " + angka);
        System.out.println(" Adalah Predikat : " + predikat);
    }
}
