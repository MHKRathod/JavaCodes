import java.util.*;

public class FindCharAtOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String temp = "";
        for(int i=1;i<n.length();i+=2){
              temp =temp+n.charAt(i);
        }
        System.out.println(temp);
    }
}