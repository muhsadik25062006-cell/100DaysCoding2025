public class Cantik {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String a = A.toUpperCase();
        String b = "TIDAK CANTIK";
        if (a.contains("I") && a.contains("S") && a.contains("C")) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == 'I') {
                    for (int j = i; j < a.length(); j++) {
                        if (a.charAt(j) == 'S') {
                            for (int k = j; k < a.length(); k++) {
                                if (a.charAt(k) == 'C') {
                                    b = "CANTIK";
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(b);
    }

}
