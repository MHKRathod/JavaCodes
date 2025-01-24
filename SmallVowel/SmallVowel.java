import java.util.*;

public class SmallVowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        String n = num.toLowerCase(); 
        String result = "";

        for(int i =0; i<n.length();i++){
            if(Character.isLetter(n.charAt(i))){
                if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u') {
                     result+=n.charAt(i);
                } 
            }
        }

        char[] arr = result.toCharArray();
        Arrays.sort(arr);

        System.out.println(arr[0]);
    }
}