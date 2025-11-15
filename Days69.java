package ltihanhari2;
import java.util.Scanner;
public class pasword {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String username = "sadit";
        String password = "12345";
        int percobaan = 3;
        for (int i = 1; i <= percobaan; i++) {
            System.out.print("Username : ");
            String user = in.nextLine();
            System.out.print("Password  : ");
            String pass = in.nextLine();
            if (user.equals(username)&&pass.equals(password)) {
                System.out.println("Login berhasil! Selamat datang");
                return;
            }else{
                System.out.println("Login gagal! Coba lagi");
                if (i >= percobaan) {
                    System.out.println("Akses ditolak");
                }
            }
            
        }
    }
}
