import java.util.Scanner;

public class arrayAverageScore03_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] finalScore = new int[5];
        double totalPassed = 0, totalFailed = 0;
        double averagePassed, averageFailed;
        int totalStudents = 0;
        int countPassed = 0, countFailed = 0;

        System.out.print("Enter the number of students: ");
        totalStudents = sc.nextInt();

        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            finalScore[i] = sc.nextInt();

            if (finalScore[i] > 70){
                totalPassed += finalScore[i];
                countPassed++;
            } else{
                totalFailed += finalScore[i];
                countFailed++;
            }
            
        }
            if (countPassed > 0){
                averagePassed = totalPassed / countPassed;
                System.out.println("The average score of students who passed is " +averagePassed);
            }
            if (countFailed > 0){
                averageFailed = totalFailed / countFailed;
                System.out.println("The average score of students who failed is " +averageFailed);
            }
        
    }
}
            
        
        