package store.budget.situation;

import store.budget.Budget;

import java.math.BigDecimal;

public class Approve extends BudgetSituation {
    @Override
    public BigDecimal computeExtraDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
