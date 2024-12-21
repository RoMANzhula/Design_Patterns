package behavioral_patterns.strategy_pattern;

import java.math.BigDecimal;

public class PayPalPayment implements PaymentStrategy {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Payment " + amount + "$ by PayPal: " + email);
    }

}
