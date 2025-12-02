package coding100days;
public class harike86 {
    public static void main(String[] args) {
        int [] angka = {10,30,20,100,80,50};
        int min = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("Nilai minimal : " + min);
    }
}
