import java.util.Scanner;

public class arrayAverageScore03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] score = new int[10];
        double total = 0;
        double average;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score  " + i + ": ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        
        average = total / score.length;
        System.out.println("The class average score is "+ average);
    }
}


