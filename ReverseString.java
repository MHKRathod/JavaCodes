import java.util.*;

public class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.nextLine();
        String st = String.valueOf(num);
        StringBuilder ans = new StringBuilder();
        ans.append(num);
        ans.reverse();

        System.out.println(ans);
        sc.close();   
        }
}