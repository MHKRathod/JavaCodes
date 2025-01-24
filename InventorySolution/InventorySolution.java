import java.util.*;


public class InventorySolution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Inventory[] arr = new Inventory[4];

        for(int i=0;i<4;i++){
            String a = sc.nextLine();
            int b = sc.nextInt(); sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            
            arr[i]= new Inventory(a,b,c,d);
        }
         
         int limit = sc.nextInt(); sc.nextLine();

         Inventory[] ans = Replenish(arr,limit);
         for(int i=0;i<ans.length;i++){
         if(ans[i].getThreshold()>75){
            System.out.println(ans[i].getInventoryId()+""+"Critical Filling");
         }
         else if(ans[i].getThreshold()>50 && ans[i].getThreshold()<75){
            System.out.println(ans[i].getInventoryId()+""+"Moderate Filling");
         }
         else if(ans[i].getThreshold()<50){
            System.out.println(ans[i].getInventoryId()+""+"Non Critical Filling");
         }
         }

        sc.close();
    } 

    public static Inventory[] Replenish(Inventory[] arr, int limit){
        
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getThreshold()<=limit){
                count++;
            }
        }

        if(count==0){
            return null;
        }

        Inventory[] ans= new Inventory[count];
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getThreshold()<=limit){
                ans[p++]=arr[i];
            }
        }

        return ans;

        
    }
}

class Inventory{
    String inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold){
        this.inventoryId = inventoryId;
        this.maximumQuantity=maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public int getThreshold(){
        return threshold;
    }
    public String getInventoryId(){
        return inventoryId;
    }


}

