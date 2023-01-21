package store.budget.situation;

import store.DomainException;
import store.budget.Budget;

import java.math.BigDecimal;

public class Finished extends BudgetSituation {
    @Override
    public BigDecimal computeExtraDiscount(Budget budget) {
        throw new DomainException("A budget in finished situation cannot receive extra discount");
    }
}
