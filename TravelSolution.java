import java.util.*;

public class TravelSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgency[] arr = new TravelAgency[4];
        for(int i=0; i<4; i++)
        {
           int a= sc.nextInt();  sc.nextLine();
           String b=sc.nextLine();
           String c=sc.nextLine();
           int d= sc.nextInt();  sc.nextLine();
           boolean e=sc.nextBoolean();
    
           arr[i]=new TravelAgency(a,b,c,d,e);
        }
    
        int regNo = sc.nextInt();  sc.nextLine();
        String pakageType = sc.nextLine();
    
           int max = findAgencyWithHighestPackagePrice(arr);
           System.out.println(max);
    
    
           TravelAgency result = agencyDetailsforGivenIdAndType(arr, regNo, pakageType);
           System.out.println(result.getAgencyName()+":"+result.getPrice());
           sc.close();
        }
    
        public static int findAgencyWithHighestPackagePrice(TravelAgency[] arr)
        {
            int max = arr[0].getPrice();
            for(int i=1; i<arr.length; i++)
            {
                if(max<arr[i].getPrice())
                {
                    max = arr[i].getPrice();
                }
            }
    
            if(max<0)
            {
                return 0;
            }
            else
            {
               return max;
            }
        }
    
        public static TravelAgency agencyDetailsforGivenIdAndType(TravelAgency[] arr, int regNo, String pakageType)
        {
            for(int i=0; i<arr.length; i++)
            {
           if(arr[i].flightFacility == true)
           {
              if(arr[i].getRegNo()==regNo && arr[i].getPakageType().equals(pakageType))
              {
                return arr[i];
              }
           }
        }
            return null;
    }
        
    }
    
    class TravelAgency {
        int regNo;
        String agencyName;
        String pakageType;
        int price;
        boolean flightFacility;
    
        public TravelAgency(int regNo,String agencyName, String pakageType ,int price, boolean flightFacility){
            this.regNo = regNo;
            this.agencyName = agencyName;
            this.price = price;
            this.pakageType = pakageType;
            this.flightFacility = flightFacility;
        }
    
    
        public int getRegNo() {
            return regNo;
        }
    
        public String getAgencyName() {
            return agencyName;
        }
    
        public String getPakageType() {
            return pakageType;
        }
    
        public int getPrice() {
            return price;
        }
    
        public boolean getFlightFacility() {
            return flightFacility;
        }
    
    }
    
    
    
    