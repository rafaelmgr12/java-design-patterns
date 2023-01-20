package store.discount;

import store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount{
    public NoDiscount(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal makeCompute(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean isApplicable(Budget budget) {
        return true;
    }
}
