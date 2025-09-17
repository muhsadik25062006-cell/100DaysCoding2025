package Isc;
public class Day10java {
    public static void main(String[] args) {
           /*
        final variable biasa di gunakan untuk menentukan isi variable 
        dan tidak dapat di ganti karna kalau misalkan kita ganti
        isi variable final tersebut maka akan terjadi error
        */   
         //contoh 1:
        int nilai1 = 99;
        nilai1 = 88;
        System.out.println("Nilai1 : " +nilai1);
        /*Contoh pertama masih bisa kita ganti atau update suatu nilai karna belum menambahkan kata final");*/
      
        //contoh 2:
        final String nama = "Sadit";        
        final String nim = "D0225520";
        System.out.println("Nama : "+ nama);
        System.out.println("Nim : "+ nim);
        /*contoh ke dua ini sudah tidak bisa kita update karena sudah menambahkan final variabel di samping String jadi jika kita ingin mengupdate nilai tersebut maka akan terjadi eror");*/
        
    }
    
}
