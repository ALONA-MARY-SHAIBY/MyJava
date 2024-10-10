package Module3;
import java.util.Scanner;
 class InvalidnumberException extends Exception {
    private String message;   
    public InvalidnumberException(String msg) {
        message = msg;
    }
    public String getMessage() {
        return message;
    }
}
public class Invalidnumexcep {
    public static void main(String[] args) {
        // CUSTOM EXCEPTION
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int lim = sc.nextInt();
        int[] A = new int[lim];
        int sum = 0, count = 0;
        float avg;
        System.out.println("Enter " + lim + " numbers:");
        for (int i = 0; i < lim; i++) {
            A[i] = sc.nextInt();  // Read values into the array
        }
        System.out.println("The numbers:");
        for (int i = 0; i < lim; i++) {
            try {
                if (A[i] > 0) {
                    System.out.println(A[i]);
                    sum += A[i];
                    count++;
                } 
                else {
                    throw new InvalidnumberException("Invalid Number: " + A[i]);
                }
            }
            catch (InvalidnumberException e) {
                System.out.println(e.getMessage());
            }
        }
        if (count > 0) {
            System.out.println("The sum is " + sum);
            avg = (float) sum / count;
            System.out.println("The average is " + avg);
        }
    }
}
