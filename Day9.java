package Isc;
public class Harike9 {
    public static void main(String[] args) {
            // DEKLARASI 
        String Nama; 
        float BeratBadan;        
        double nilaiRataRata;
        
        // INISIALISASI 
        Nama = "Sadit";
        BeratBadan = 56.5f;        
        nilaiRataRata = 95;
                
        System.out.println("Nama : " + Nama);
        System.out.println("Berat Badan : " + BeratBadan + " kg");
        System.out.println("nilaiRataRata : " + nilaiRataRata+ " Semester 1");
        
        // UPDATE VARIABEL
        Nama = "Muhammad Sadit";
        BeratBadan = 59.5f;
        nilaiRataRata = 98.9;
        
        System.out.println("\nsetelah update variable");
        System.out.println("Nama : " + Nama);
        System.out.println("Berat Badan : " +BeratBadan+ " Kg");
        System.out.println("nilaiRataRata : " + nilaiRataRata + " Semester 2");
    }
}
