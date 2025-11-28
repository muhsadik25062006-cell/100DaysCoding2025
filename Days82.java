package coding100days;
import java.util.Scanner;
public class harike82 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukan jumlah array : ");
        int array = in.nextInt();
        int [] angka = new int[array];
        for (int i = 0; i < array; i++) {
            System.out.print("masukan array ke-" + (i + 1) + " : ");
            angka[i] = in.nextInt();        
        }
        System.out.print("Semua elemen array : ");
        for (int i : angka) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
