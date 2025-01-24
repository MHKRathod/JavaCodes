import java.util.*;

public class FindChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b =sc.nextLine();
        int ans = position(a,b);
        System.out.print(ans);
        sc.close();
    }

    public static int position(String a,String b){
        
        for(int i =0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(0)){
                return i;
            }
        }
        return -1;
    }
}