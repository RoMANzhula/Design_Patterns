package behavioral_patterns.strategy_pattern;

import java.math.BigDecimal;

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(BigDecimal amount) {
        paymentStrategy.pay(amount);
    }

}
