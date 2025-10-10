package Isc;
import java.util.Scanner;
public class day33 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        //Operator Logika Not(!)
        System.out.print(" nilai a : ");
        int a = in.nextInt();
        System.out.print(" nilai b : ");
        int b = in.nextInt();

        System.out.println(!(a > b));
        System.out.println(!(a < b));  
    }
}
