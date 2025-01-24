import java.util.*;

public class StudentSolution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[4];
        for(int i=0;i<4;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();

          arr[i]=new Student(a,b,c);
        }

        String result = findStudentWithHighestTotal(arr);
        System.out.println(result.toUpperCase());

        Student[] ans=searchStudentByPercentage(arr);
        if(ans!=null){
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i].getId());
            }
        }

        sc.close();
    }

    public static String findStudentWithHighestTotal(Student[] arr){
        int max=Integer.MIN_VALUE;
        String result = "";
        for(int i=0;i<arr.length;i++){
            if(max < arr[i].getTotalMarksObtained()){
                max = arr[i].getTotalMarksObtained();
                result = arr[i].getName();
            }
           
        }

        return result;
    }

    public static Student[] searchStudentByPercentage(Student[] arr){
         
         int count =0;
        for(int i=0;i<arr.length;i++){
            double percentage = (arr[i].getTotalMarksObtained()/400.0) * 100;
            if(percentage > 70 ){
                count++;
            }
        }

        if(count==0){
            return null;
        }

        Arrays.sort(arr,(a,b)->(a.getId()-b.getId()));

        int p =0;
        Student[] ans = new Student[count];
         for(int i=0;i<arr.length;i++){
            double percentage = (arr[i].getTotalMarksObtained()/400.0) * 100;
            if(percentage > 70 ){
                ans[p++]=arr[i];
            }
         }

         return ans;
    }
}



class Student{
    int id;
    String name;
    int totalMarksObtained;

    public Student(int id,String name,int totalMarksObtained){
        this.id =id;
        this.name=name;
        this.totalMarksObtained=totalMarksObtained;
    }

    public int getTotalMarksObtained(){
        return totalMarksObtained;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

}