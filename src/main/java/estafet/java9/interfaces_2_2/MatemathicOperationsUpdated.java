package org.estafet.java9.interfaces_2_2;

public interface MatemathicOperationsUpdated {
    // Abstract Method
    void sum(int firstNum, int secondNum);

    /**
     * Multiply two int numbers
     *
     * @param firstNum int
     * @param secondNum int
     * @return int
     */
    private int mul(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    /**
     * Static method dividing two integers
     *
     * @param firstNum  int
     * @param secondNum int
     * @return int
     */
    private static int divide(int firstNum, int secondNum) {
        try {
            return firstNum / secondNum;
        } catch (ArithmeticException ae) {
            System.err.println("ArithmeticException occurred!");
            return 0;
        }
    }

    /**
     * Default method implementation print the result after dividing, multiplying two integers
     *
     * @param firstNum  int
     * @param secondNum int
     */
   public default void mathOperations(int firstNum, int secondNum) {
        // use of private static method
        System.out.println(firstNum+" / " + secondNum + " = " + divide(firstNum, secondNum));
        // use of private NON-static method
        System.out.println(firstNum+" * " + secondNum + " = " + mul(firstNum, secondNum));
    }
}
