import java.util.*;

public class SimSolution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Sim[] arr = new Sim[5];

        for(int i=0;i<5;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            double c= sc.nextDouble(); sc.nextLine();
            double d= sc.nextDouble(); sc.nextLine();
            String e = sc.nextLine();

            arr[i]=new Sim(a,b,c,d,e);
        }

        String circle1 = sc.nextLine();
        String circle2=sc.nextLine();

        Sim[] ans = transferCustomerCircle(arr,circle1,circle2);
        if(ans!=null){
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i].getSimId()+" "+ans[i].getCustomerName()+" "+ans[i].getCircle()+" "+ans[i].getRatePerSecond());
            }
        }
        sc.close();
    }

    public static Sim[] transferCustomerCircle(Sim[] arr, String circle1,String circle2){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCircle().equalsIgnoreCase(circle1)){
                count++;
            }
        }

        if(count==0){
            return null;
        }

        Sim[] ans=new Sim[count];
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCircle().equalsIgnoreCase(circle1)){
                arr[i].setCircle(circle2);
                ans[p++]=arr[i];
            }
        }
        return ans;

    }
}





class Sim{
    int simId;
    String customerName;
    double balance;
    double ratePerSecond;
    String circle;

    public Sim(int simId,String customerName,double balance,double ratePerSecond,String circle){
        this.simId=simId;
        this.customerName=customerName;
        this.balance=balance;
        this.ratePerSecond=ratePerSecond;
        this.circle=circle;
    }

    public String getCircle(){
        return circle;
    }

    public int getSimId(){
        return simId;
   }

    public String getCustomerName(){
        return customerName;
    }

    public double getRatePerSecond(){
        return ratePerSecond;
    }

    public void setCircle(String circle){
        this.circle=circle;
    }
}