import java.util.*;

public class PlayerSolution{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       Player[] arr= new Player[4];

       for(int i=0;i<4;i++){
        int a = sc.nextInt();
        sc.nextLine();

        String b = sc.nextLine();
        int c = sc.nextInt();
        sc.nextLine();
        String d = sc.nextLine();
        String e = sc.nextLine();

        arr[i]= new Player(a,b,c,d,e);
       }

       String value = sc.nextLine();
       String vlaue = sc.nextLine();


       int min = findPlayerWithLowestRuns(arr,value);
       if(min==Integer.MAX_VALUE){
        System.out.println("no such player");
       }
       else{
        System.out.println(min);
       }


       Player[] ans = findPlayerByMatchType(arr,vlaue);
       if(ans!=null){
        for(int i=0;i<ans.length;i++){
        System.out.println(ans[i].getPlayerId());
       }

       }
       else{
        System.out.println("no player with given match type");
       }
       sc.close();
    }

    public static int findPlayerWithLowestRuns(Player[] arr,String value){
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPlayerType().equals(value)){
               if(min > arr[i].getRuns()){
                min = arr[i].getRuns();
               }
            }

        }
        if(min==0){
                return 0;
            }
            else{
                return min;
            }
    } 

    public static Player[] findPlayerByMatchType(Player[] arr, String vlaue){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getMatchType().equals((vlaue))){
               count++;
            }
        }
        if(count==0){
            return null;
        }

        Arrays.sort(arr,(a,b)->(b.getRuns()-a.getRuns()));
        int p=0;
        Player[] ans=new Player[count];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getMatchType().equals((vlaue))){
               ans[p++]=arr[i];
            }
        }
        return ans;
    }
}


class Player{
    int playerId;
    String playerName;
    int runs;
    String playerType;
    String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType){
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

  
    public String getPlayerType(){
        return playerType;
    }

    public String getMatchType(){
        return matchType;
    }

    public int getRuns(){
        return runs;
    }

    public int getPlayerId(){
        return playerId;
    }
}