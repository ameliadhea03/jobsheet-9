import java.util.Scanner;

public class linierSearch03_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] scoreKey = new int [10];
        int totalKey = 0;
        int result = 0;
        int search = 0;

        System.out.print("Enter the number of array elements: ");
        totalKey = sc.nextInt();

        for (int i = 0; i < totalKey; i++) {
            System.out.print("Enter the array element  " + i + ": ");
            scoreKey[i] = sc.nextInt();
        }

        System.out.print("Enter the key you want to search for: ");
        search = sc.nextInt();
        for (int i = 0; i < totalKey; i++){
            if (scoreKey[i] == search){
                result = 1;
                System.out.println("The key in the array is located at index position " +i);
                break;
            }
        }
        

    }
}
