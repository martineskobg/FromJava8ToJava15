package estafet.java8.Interfaces_default_and_static_methods;

public interface MatemathicOperations {
    /*
    "1. Write an interface covering some mathematical operations against 2 numbers.
        Define abstract, static and default methods.
     2. Write a short program that uses those methods and prints the results from the defined operations"
     */

    // Abstract Method
    int sum(int firstNum, int secondNum);

    /**
     * Static method dividing two integers
     *
     * @param firstNum  int
     * @param secondNum int
     * @return int
     */
    static int divide(int firstNum, int secondNum) {
        try {
            return firstNum / secondNum;
        } catch (ArithmeticException ae) {
            System.err.println("ArithmeticException occurred!");
            return 0;
        }
    }

    /**
     * Default method implementation get the result after dividing two integers
     *
     * @param firstNum  int
     * @param secondNum int
     * @return int
     */
    default Integer getDivisionResult(int firstNum, int secondNum) {
        return divide(firstNum, secondNum);
    }

}
