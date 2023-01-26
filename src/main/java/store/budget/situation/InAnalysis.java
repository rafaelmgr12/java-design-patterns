package store.budget.situation;

import store.budget.Budget;

import java.math.BigDecimal;

public class InAnalysis extends BudgetSituation {

    @Override
    public BigDecimal computeExtraDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void approve(Budget budget) {
        budget.setSituation(new Approve());
    }

    @Override
    public void reject(Budget budget) {
        budget.setSituation(new Disapproved());
    }
}
