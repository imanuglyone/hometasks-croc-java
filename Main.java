public class Main {
    /**
     * Javadoc.
     * A program that replaces multiples of three and five with the words «Fizz» and «Buzz».
     * @author Popov Danil
     * @version 1.0
     */
    public static void main(String[] args) {
        //To solve this problem, you can use the condition operators and the for loop.
        for (int i = 1; i <= 100; i++) {
            /*
            Inside the loop, we check each number for multiplicities of three and five, and output the corresponding words or the number itself.
            Note that we use the operators && (logical "and") to combine conditions.
            */
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}