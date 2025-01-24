import java.util.*;

public class RemoveOccurance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        String temp="";
        for(int i=0;i<a.length();i++){
            if(temp.indexOf(a.charAt(i)) == -1){
                temp = temp + a.charAt(i);
            }
        }
        System.out.println(temp);
        sc.close();
    }
}