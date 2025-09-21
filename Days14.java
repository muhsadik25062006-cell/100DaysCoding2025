package PemulaCoding ;

public class Day14 {
    
    public static void main(String[] args) {
       //String sumber
        String nama = "Muhammad Sadit";
        String angka1 = "19";
        String angka2 = "25";
        String angka3 = "07";
        String angka4 = "2006";
        String angka5 = "165.f";
        String angka6 = "59.0";
        String angka7 = "true";
        String angka8 = "A";

        // Konversi ke tipe primitif
        byte umur = Byte.parseByte(angka1);
        short tanggal = Short.parseShort(angka2);
        int bulan = Integer.parseInt(angka3);
        long tahun = Long.parseLong(angka4);
        float tinggiBadan = Float.parseFloat(angka5);
        double beratBadan = Double.parseDouble(angka6);
        boolean pintar = Boolean.parseBoolean(angka7);
        char nilai = angka8.charAt(0);

        // Cetak hasil
        System.out.println("Nama        : " + nama);
        System.out.println("umur        : " + umur + "Tahun");
        System.out.println("tanggal     : " + tanggal );
        System.out.println("bulan       : " + bulan);
        System.out.println("tahun       : " + tahun);
        System.out.println("tinggiBadan : " + tinggiBadan + " Cm");
        System.out.println("beratBadan  : " + beratBadan + " Kg");
        System.out.println("pintar      : " + pintar);
        System.out.println("nilai       : " + nilai);
        
        
    }     
          }
