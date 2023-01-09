package store.discount;

import java.math.BigDecimal;
import store.budget.Budget;

public class ComputeDiscount {
    public BigDecimal compute(Budget budget) {
        if (budget.getItemsQuantity() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }
        return BigDecimal.ZERO;
    }
}
