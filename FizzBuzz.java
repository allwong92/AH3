import java.util.Scanner;       // import Scanner class
public class FizzBuzz {
    public static void fizzBuzz(int n){
        /*
        This method takes an integer (n) as the input and prints 1 to n based on FizzBuzz conditions:
                i. If the number is a multiple of 3, print "Fizz" instead of the number.

                ii. If the number is a multiple of 5, print "Buzz" instead of the number.

                iii. If the number is a multiple of both 3 and 5, print "FizzBuzz" instead of the number.
         */
        System.out.print("Output: ");

        for (int i = 1; i <=n; i++){ // iterate from integers 1 to n

            if ((i % 3 == 0) && (i % 5 == 0)){  // if int is multiple of 3 and 5
                System.out.print("FizzBuzz ");

            } else if (i % 5 == 0) {            // if int is multiple of 5
                System.out.print("Buzz ");

            } else if (i % 3 == 0) {            // if int is multiple of 3
                System.out.print("Fizz ");

            } else {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {

        // Create Scanner object for n
        Scanner console = new Scanner(System.in);

        // Prompt user for input and get n
        System.out.println("Input: ");
        int n = console.nextInt();
        fizzBuzz(n);

    }
}
