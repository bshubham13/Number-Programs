import java.util.Scanner;

public class Happy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a happy number: ");
        int number = scanner.nextInt();

        int result = number;
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            while (result > 0) {
                int digit = result % 10;
                sum += digit * digit;
                result /= 10;
            }
            result = sum;
            if (result == 1) {
                System.out.println(number + " is a happy number.");
                return;
            }
        }

        System.out.println(number + " is not a happy number.");
    }
}
