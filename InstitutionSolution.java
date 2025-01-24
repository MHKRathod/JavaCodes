import java.util.*;

public class InstitutionSolution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Institution[] arr = new Institution[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
            arr[i] = new Institution(a, b, c, d, e); 
        }

        String location = sc.nextLine();
        String institutionName = sc.nextLine();

        int ans = findNumClearancedByLoc(arr, location);
        if (ans != 0) {
            System.out.println(ans);
        } else {
            System.out.println("no cleared students");
        }

        Institution result = UpdateInstitutionGrade(arr, institutionName);
        if (result != null) {
            System.out.println(result.getInstitutionName() + "::" + result.getGrade());
        } else {
            System.out.println("no Institution available");
        }
        sc.close();
    }

    public static int findNumClearancedByLoc(Institution[] arr, String location) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getLocation().equalsIgnoreCase(location)) {
                sum += arr[i].getNoOfStudentsCleared();
            }
        }
        return sum;
    }

    public static Institution UpdateInstitutionGrade(Institution[] arr, String institutionName) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getInstitutionName().equalsIgnoreCase(institutionName)) {
                int cleared = arr[i].getNoOfStudentsCleared();
                if (cleared > 0) {
                    int rating = (arr[i].getNoOfStudentsPlaced() * 100) / arr[i].getNoOfStudentsCleared();
                    if (rating >= 80) {
                        arr[i].setGrade("A");
                    } else {
                        arr[i].setGrade("B");
                    }
                } 
                return arr[i];
            }
        }
        return null;
    }
}

// Institution class as a separate top-level class
class Institution {
    int institutionId;
    String institutionName;
    int noOfStudentsPlaced;
    int noOfStudentsCleared;
    String location;
    String grade;

    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }

    public int getInstitutionId() { return institutionId; }
    public String getInstitutionName() { return institutionName; }
    public int getNoOfStudentsPlaced() { return noOfStudentsPlaced; }
    public int getNoOfStudentsCleared() { return noOfStudentsCleared; }
    public String getLocation() { return location; }
    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}
