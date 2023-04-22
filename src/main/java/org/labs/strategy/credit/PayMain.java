package org.labs.strategy.credit;

public class PayMain {
    public static void main(String[] args) {
        PayManager  payManager = new PayManager(new MasterCard());
        payManager.doPay(10.00);

        payManager = new PayManager(new Visa());
        payManager.doPay(100.00);

        payManager = new PayManager(new PayPal());
        payManager.doPay(10000.00);
    }
}
