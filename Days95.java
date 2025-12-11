package coding100days;
import java.util.Scanner;
public class harike95 {
    public static void kataKata(String kata ) {
        System.out.println(kata);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan kata kata : ");
        String a = in.nextLine();
        kataKata(a);
    }
}
