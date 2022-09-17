import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeNumberMethodTest {

    // Write the boolean class of isPrime() and then test to see that it is giving the correct booleans for each result.

    @org.junit.jupiter.api.Test
    void main() {
        int var = 2;
        int varFalse = 4;

        assertTrue(isPrime(var));
        assertFalse(isPrime(varFalse));
    }

    @org.junit.jupiter.api.Test
    boolean isPrime(int number) {
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