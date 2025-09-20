package commitanMenti;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("selamat datang");
        String nama, nim, hobi;
        int usia;
        float tinggi;
        boolean status;

        System.out.print("nama : ");
        nama = in.nextLine();
        System.out.print("nim : ");
        nim = in.nextLine();
        System.out.print("hobi : ");
        hobi = in.nextLine();
        System.out.print("usia : ");
        usia = in.nextInt();
        System.out.print("tinggi : ");
        tinggi = in.nextFloat();
        System.out.print("status : ");
        status = in.nextBoolean();

        int tabungan = 1000000;
        System.out.println("tabungan awal : Rp " + tabungan);
        tabungan = tabungan + 500000;
        System.out.println("tabungan setelah ditambah Rp500000 : Rp " + tabungan);
        tabungan = tabungan - 200000;
        System.out.println("tabungan setelah dikurangi Rp 200000 : Rp " + tabungan);

        double PHI = 3.14159;
        System.out.print("Masukan jari-jari = ");
        double r = in.nextDouble();
        double L;

        L = PHI * r * r;
        System.out.println("luas lingkaran = " + L);

        System.out.println("====Biodata Mahasiswa====");
        System.out.println("nama " + nama);
        System.out.println("nim " + nim);
        System.out.println("hobi " + hobi);
        System.out.println("usia " + usia + "tahun");
        System.out.println("tingi " + tinggi + " cm");
        System.out.println("status " + status);

    }
}
