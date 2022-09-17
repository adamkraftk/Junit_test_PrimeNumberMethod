import java.util.Scanner;

public class PrimeNumberMethod {

    public static void main(String[] args){
        // Main method accepts user input and allows us to display results.
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a number to determine if it is prime: ");
        int userNum = userInput.nextInt();

        boolean ans = isPrime(userNum);

        if(ans){
          System.out.print("Number is a Prime Number");
        }
        else{
            System.out.print("Number is not Prime");
        }
    }

    public static boolean isPrime(int number){
        // Determine if a number is prime.
        // If the number is smaller than or equal to 1 it cannot be prime.
        // If it is to or three it is a prime.
        // Check for all possible divisors.
        // If there are no divisors that equal 0 then it equals true.
        if (number == 2 || number == 3)
            return true;

        if (number <= 1 || number % 2 == 0 || number % 3 == 0)
            return false;

        for (int i = 5; i * i <= number; i += 6)
        {
            if (number % i == 0 || number % (i + 2) == 0)
                return false;
        }

        return true;
}
}
