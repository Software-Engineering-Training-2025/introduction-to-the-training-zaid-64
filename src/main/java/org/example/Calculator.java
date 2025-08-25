package org.example;

public class Calculator {

    public enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    public double calculate(double a, double b, Operator op) {
        if (op == Operator.ADD) {
            return a + b;
        } else if (op == Operator.SUBTRACT) {
            return a - b;
        } else if (op == Operator.MULTIPLY) {
            return a * b;
        } else if (op == Operator.DIVIDE) {
            // throw an ArithmeticException when b == 0
            if(b == 0) {
                throw new ArithmeticException();
            }
            return a / b;
        } else {
            throw new IllegalArgumentException("Unknown operator");
        }
    }
}
