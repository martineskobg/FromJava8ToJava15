package org.estafet.Interfaces_default_and_static_methods;

public interface MatemathicOperations {

    int sum(int firstNum, int secondNum);

    //default implementation
    static public int divide(int firstNum, int secondNum) {
        try {
            return firstNum / secondNum;
        } catch (ArithmeticException ae) {
            System.err.println("ArithmeticException occurred!");
            return 0;
        }
    }

    default Integer getDivisionResult(int firstNum, int secondNum) {
        return divide(firstNum, secondNum);
    }

}
