package store.discount;

import java.math.BigDecimal;
import store.budget.Budget;

public class ComputeDiscount {
    public BigDecimal compute(Budget budget) {
      Discount discount = new DiscountForBudgetWithValueMorethanFivehundred(
        new DiscountForBudgetWithMoreThanFiveItens(
          new NoDiscount(null)
        )
      );
        return discount.compute(budget);
    }
}
