package behavioral_patterns.strategy_pattern;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPyment("1111-2222-3333-4444"));
        cart.checkOut(BigDecimal.valueOf(105));

        cart.setPaymentStrategy(new PayPalPayment("email_payment@example.com"));
        cart.checkOut(BigDecimal.valueOf(347));
    }

}

// Output:
//Payment 105$ by credit card: 1111-2222-3333-4444
//Payment 347$ by PayPal: email_payment@example.com
