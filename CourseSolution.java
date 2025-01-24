import java.util.*;

class Course{

    int courseid;
    String courseName;
    String courseAdmin;
    int quiz;
    int handson;

    public Course(int courseid, String courseName, String courseAdmin, int quiz, int handson){
        this.courseid = courseid;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz= quiz;
        this.handson=handson;
    }

    public int getcourseid(){
        return courseid;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getCourseAdmin(){
        return courseAdmin;
    }

    public int getQuiz(){
        return quiz;
    }

    public int getHandsOn(){
        return handson;
    }
}


public class CourseSolution {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       Course[] arr = new Course[4];

       for(int i=0;i<4;i++){

           int a = sc.nextInt();  sc.nextLine();
           String b = sc.nextLine();
           String c = sc.nextLine();
           int d = sc.nextInt(); sc.nextLine();
           int e = sc.nextInt(); sc.nextLine();

           arr[i] = new Course(a,b,c,d,e);
       }
 

       String courseAdmin = sc.nextLine();
       int handson = sc.nextInt();

       int avg = findAvgOfQuizByAdmin(arr,courseAdmin);
       if(avg!=0){
        System.out.println(avg);
       }
       else{
        System.out.println("no result");
       }

       Course[] obj = sortCourseByHandsOn(arr, handson);
       if(obj!=null){
        for(int i=0;i<obj.length;i++){
           System.out.println(obj[i].courseAdmin);
        }
       }

       sc.close();

    }

    static int findAvgOfQuizByAdmin(Course[] arr, String x)
    {
        int sum =0;
        int count =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i].getCourseAdmin().equalsIgnoreCase(x)){
                sum+=arr[i].getQuiz();
                count++;
            }
        }

        if(count<=0){
            return 0;
        }
        else{
            int avg = sum/count;
            return avg;
        }
    }

    static Course[] sortCourseByHandsOn(Course[] arr, int h){

        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getHandsOn()<h){
                count++;
            }
        }

        if(count == 0){
            return null;
        }

        Arrays.sort(arr,(a,b)->(a.getHandsOn()-b.getHandsOn()));

        Course[] obj = new Course[count];
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getHandsOn()<h){
               obj[p++]=arr[i];
            }
        }

        return obj;
    }
    
}
