package Isc;
import java.util.Scanner;
public class day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Program Evaluasi Mentor ===");
        int teori,praktik;
        System.out.print("Nilai Teori   : ");
        teori = input.nextInt();
        System.out.print("Nilai Praktik : ");
        praktik = input.nextInt();
        System.out.println("================================");
        System.out.println("Nilai Teori   : " + teori);
        System.out.println("Nilai Praktik : " + praktik);
        if (teori >= 90 && praktik >= 90) {
            System.out.println("Predikat      : A");
            System.out.println("Keterangan    : lulus dengan predikat Sangat Baik");
        } 
        else if (teori >= 80 && praktik >= 75) {
            System.out.println("Predikat      : B");
            System.out.println("Keterangan    : Lulus dengan predikat baik");
        } 
        else if (teori >= 70 && praktik >= 70) {
            System.out.println("Predikat      : C");
            System.out.println("Keterangan    : Lulus dengan predikat cukup");
        } 
        else if (teori < 70 && praktik <70 ) {
            System.out.println("Predikat      : D");
            System.out.println("Keterangan    : Tidak Lulus");
        } else if (teori < 0 && praktik >100 || teori > 100 && praktik < 0){
            System.out.println("Nilai tidak valid!  harus antara 0 - 100");
        }
    }
              }
