import java.util.*;

public class LastCharOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String temp = "";
        for (int i=0;i<a.length();i++){
            if((i == a.length()-1 || a.charAt(i+1)==' ') && Character.isLetter(a.charAt(i)) && a.charAt(i)!=' '){
                temp=temp+a.charAt(i);
            }
        }
        System.out.println(temp);
        sc.close();
    }
}