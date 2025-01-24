import java.util.*;

public class PrintConsonant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String n = num.toLowerCase();

        for(int i=0;i<n.length();i++){
            if(Character.isLetter(n.charAt(i))){
                if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u') {
                    continue;
                }
                else{
                    System.out.print(n.charAt(i));
                }
            }
        }
    }
}