import java.util.Scanner;

public class arrayAverageScore03_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] score = new int[10];
        double total = 0;
        double average;
        int count = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score  " + i + ": ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            total += score[i];
            if (score[i] > 70){
                count++;
            }
        }
        
        System.out.println("The students who passed: "+ count);

        average = total / score.length;
        System.out.println("The class average score is "+ average);
    }
}

