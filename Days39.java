package PemulaCoding;
import java.util.Scanner;
public class Daybljr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==== menu minuman ==== ");
        System.out.println(" 1.kopi \n 2.capucino \n 3.jus jeruk");
        System.out.print(" pilihan : ");
        int pilihan = in.nextInt();
        if (pilihan == 1){
            System.out.println(" kopi ");
        } else if(pilihan == 2){
            System.out.println(" capucino");
        } else if ( pilihan == 3){
            System.out.println(" esteh");
        } 
    }
}
