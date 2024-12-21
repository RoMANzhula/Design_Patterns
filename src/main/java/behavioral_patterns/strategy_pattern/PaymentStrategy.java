package behavioral_patterns.strategy_pattern;

import java.math.BigDecimal;

public interface PaymentStrategy {

    void pay(BigDecimal amount);

}
