import java.util.*;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        String n = num.toLowerCase();  // Convert to lowercase

        int v = 0;
        int c = 0;

        for (int i = 0; i < n.length(); i++) {  // Use n.length() instead of n.length
            if (Character.isLetter(n.charAt(i))) {
                if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
        }

        if (v > 0 || c > 0) {
            System.out.println("Vowels: " + v);
            System.out.println("Consonants: " + c);
        } else {
            System.out.println("Not available");
        }
        
        sc.close();
    }
}
