import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Create a StringBuilder object and append the input string
        StringBuilder reversedString = new StringBuilder(inputString);
        
        // Use the reverse() method of StringBuilder to reverse the string
        reversedString.reverse();
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversedString.toString());
    }
}
