import java.util.*;

public class NoOfSpaces{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' '){
                count++;
            }
        }
        if(count<3){
            System.out.println("NA");
        }
        else{
            System.out.println(count);
        }
    }
}