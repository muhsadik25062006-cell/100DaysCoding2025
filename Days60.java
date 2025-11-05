package coding100days;
public class harike61 {
    public static void main(String[] args) {
        int N = 10;
        System.out.println("Angka ganjil dari " + N + " sampai 1:");
        for (int i = N; i >= 1; i--) {        
            String hasil = i % 2 != 0 ? i + " " : "";
            System.out.print(hasil);
        }
        System.out.println("\nAngka genap dari " + N + " sampai 1:");
        for (int i = N; i >= 1; i--) {
            String hasil = i % 2 == 0 ? i + " " : "";
            System.out.print(hasil);
        }
        System.out.println(" ");
    }
}
