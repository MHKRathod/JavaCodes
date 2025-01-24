import java.util.*;

public class MedicineSolution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Medicine[] arr = new Medicine[4];
        for(int i=0;i<4;i++){
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i]=new Medicine(a,b,c,d);
        }
        String disease = sc.nextLine();

        Medicine[] ans = medicinePriceForGivenDisease(disease,arr);
        if(ans!=null){
            for(int i=0;i<ans.length;i++){
            System.out.println(ans[i].getPrice());
            }
        }

      sc.close();  
    } 

    public static Medicine[] medicinePriceForGivenDisease(String disease, Medicine[] arr){
        
          int count=0;
          for (int i=0;i<arr.length;i++){
                if(arr[i].getDisease().equalsIgnoreCase(disease)){
                    count++;
                }
          }
          if(count==0){
            return null;
          }

          Arrays.sort(arr,(a,b)->(a.getPrice()-b.getPrice()));

           int p=0;
          Medicine[] ans=new Medicine[count];
          for (int i=0;i<arr.length;i++){
                if(arr[i].getDisease().equals(disease)){
                    ans[p++]=arr[i];
                }
          }
          return ans;

    }
}




class Medicine{
    String medicineName;
    String batchNo;
    String disease;
    int price;

    public Medicine(String medicineName,String batchNo,String disease,int price){
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.disease = disease;
        this.price = price;
    }

     public String getDisease() {
        return disease;
     }

     public int getPrice(){
        return price;
     }
}