import java.util.*;

public class SpacesCharacterCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String Space = "";
        int x=0;
        int y=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == ' '){
                x++;
            }
            else{
                y++;
            }
        }
        System.out.println(x+" "+y);
        sc.close();
    }
}