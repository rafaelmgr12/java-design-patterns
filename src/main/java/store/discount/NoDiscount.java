package store.discount;

import store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount{
    public NoDiscount(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal compute(Budget budget) {
        return BigDecimal.ZERO;
    }
}
