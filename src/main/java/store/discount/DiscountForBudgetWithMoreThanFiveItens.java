package store.discount;

import store.budget.Budget;

import java.math.BigDecimal;

public class DiscountForBudgetWithMoreThanFiveItens extends Discount{
    public DiscountForBudgetWithMoreThanFiveItens(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal compute(Budget budget) {
        if (budget.getItemsQuantity() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        return next.compute(budget);
    }
}
