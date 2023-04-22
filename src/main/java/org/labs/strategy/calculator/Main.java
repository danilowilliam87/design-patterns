package org.labs.strategy.calculator;

public class Main {

    public static void main(String[] args) {

        Strategy strategy = new Strategy(new Sum());
        System.out.println("Sum = " + strategy.doCalculate(10.0, 5.0));

        strategy = new Strategy(new Subtract());
        System.out.println("Subtract = " + strategy.doCalculate(10.0, 5.0));
    }
}
