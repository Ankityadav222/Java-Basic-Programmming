import java.util.Scanner;

public class PalindroneNumber {
    public static void main(String [] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Scanner.nextInt();  // Readne the number

        // Step 2: Save the original number for comparison
        int originalNumber = number;

        int reversedNumber = 0;
        while(number != 0){
            int digit =  number % 10;
            reversedNumber  =  reversedNumber *10 + digit;
            number  =  number/10;

        }

        if(originalNumber == reversedNumber){
            System.out.println("Given Number is a Palindrome: " + originalNumber);
        }else{
            System.out.println("Given Number is not a palindrome");
        }
    }
}
