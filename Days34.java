package Isc;
public class Days34 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

// Kombinasi berbagai operator
boolean hasil1 = (a > b) && (a != b); // AND
boolean hasil2 = (a < b) || (a == b); // OR
boolean hasil3 = !(a >= b);           // NOT
boolean hasil4 = (a == b) || !(b > a);// Gabungan OR dan NOT
        
System.out.println("(a > b) && (a != b): " + hasil1);
System.out.println("(a < b) || (a == b): " + hasil2);
System.out.println("!(a >= b): " + hasil3);
System.out.println("(a == b) || !(b > a): " + hasil4);
    }
}
