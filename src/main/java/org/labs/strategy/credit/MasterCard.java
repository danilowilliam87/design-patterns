package org.labs.strategy.credit;

public class MasterCard extends Pay{
    @Override
    public void pay(double price) {
        System.out.println("Pay : " + price + "R$ By MasterCard");
    }
}
