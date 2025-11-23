package coding100days;
public class harike78 {
    public static void main(String[] args) {
       String teks = "  Rajin ke sekolah  ";

        String a = teks.trim();              
        String b = a.substring(0,6);     
        String c = a.replace("Rajin", "Malas"); 

        System.out.println("Setelah trim   : " + a);
        System.out.println("substring(0,6) : " + b);
        System.out.println("replace        : " + c);
        
    }
}
