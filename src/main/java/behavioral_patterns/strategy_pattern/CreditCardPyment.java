package behavioral_patterns.strategy_pattern;

import java.math.BigDecimal;

public class CreditCardPyment implements PaymentStrategy {

    private String cardNumber;

    public CreditCardPyment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Payment " + amount + "$ by credit card: " + cardNumber);
    }

}
