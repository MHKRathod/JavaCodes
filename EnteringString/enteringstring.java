import java.util.Scanner;
import java.util.Arrays;


class enteringstring {


    public boolean isAnagram(String s, String t){
        
        if(s.length() != t.length()){
           return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray,tArray);
     }

    public static void main(String[] args){

        enteringstring solution = new enteringstring();

        Scanner scanner = new Scanner(System.in);
         
        System.out.print("enter the string: ");
     
        String s = scanner.nextLine();

        System.out.print("enter the second string: ");

        String t = scanner.nextLine();

        boolean result = solution.isAnagram(s,t);

        // System.out.println("you entered :" + s);
        // System.out.println("your second string : " + t);

        if(result){
            System.out.println("they are anagram");
        }
        else{
            System.out.println("they are not");
        }

        scanner.close();

    }
}
