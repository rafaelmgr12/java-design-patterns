package store.discount;

import store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForBudgetWithValueMorethanFivehundred extends Discount {
    public DiscountForBudgetWithValueMorethanFivehundred(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal makeCompute(Budget budget) {
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }
        return next.makeCompute(budget);
    }

    @Override
    public boolean isApplicable(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }


}
