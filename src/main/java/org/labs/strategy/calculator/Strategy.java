package org.labs.strategy.calculator;

public class Strategy {

    private Calculate calculate;

    public Strategy(Calculate calculate) {
        this.calculate = calculate;
    }

    public double doCalculate(double a, double b){
        return this.calculate.calculate(a, b);
    }
}
