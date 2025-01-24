import java.util.*;

public class LargestSubstring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] arr = n.split(" ");
        String largest = "";

        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>largest.length()){
                largest = arr[i];
            }
        }

       System.out.println(largest); 
    }
}