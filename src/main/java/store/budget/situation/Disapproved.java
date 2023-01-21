package store.budget.situation;

import store.DomainException;
import store.budget.Budget;

import java.math.BigDecimal;

public class Disapproved extends BudgetSituation {

    @Override
    public BigDecimal computeExtraDiscount(Budget budget) {
        throw new DomainException("A budget in disapproved situation cannot receive extra discount");
    }
    @Override
    public void finish(Budget budget) throws DomainException {
        budget.setSituation(new Finished());
    }

}
