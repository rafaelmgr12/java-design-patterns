package store.discount;

import store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal compute(Budget budget) {
        if (isApplicable(budget)) {
            return makeCompute(budget);
        }
        return next.compute(budget);
    }

    public abstract BigDecimal makeCompute(Budget budget);
    public abstract boolean isApplicable(Budget budget);
}
