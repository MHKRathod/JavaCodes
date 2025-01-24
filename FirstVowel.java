import java.util.*;

public class FirstVowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String temp = "";
        for(int i=0;i<n.length();i++){
          if(n.charAt(0) == 'a' || n.charAt(0) == 'e' || n.charAt(0) == 'i' || n.charAt(0) == 'o' || n.charAt(0) == 'u' || n.charAt(0) == 'A' || n.charAt(0) == 'E' || n.charAt(0) == 'I' || n.charAt(0) == 'O'){
            temp=temp+n.charAt(0);
          }
          else if(n.charAt(i)==' ' && (n.charAt(i+1) == 'A' || n.charAt(i+1) == 'E' || n.charAt(i+1) == 'I' || n.charAt(i+1) == 'O' || n.charAt(i+1) == 'U' || n.charAt(i+1) == 'a' || n.charAt(i+1) == 'e' || n.charAt(i+1) == 'i' || n.charAt(i+1) == 'o' || n.charAt(i+1) == 'u')){
            temp=temp+n.charAt(i+1);
          }
        }

        System.out.println(temp);
    }
}