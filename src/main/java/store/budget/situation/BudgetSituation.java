package store.budget.situation;

import store.DomainException;
import store.budget.Budget;

import java.math.BigDecimal;

public abstract class BudgetSituation {
    public abstract BigDecimal computeExtraDiscount(Budget budget);

    public void approve(Budget budget)  throws DomainException {
           throw new DomainException("Budget already approved");

    }

    public void reject(Budget budget) throws DomainException {
        throw new DomainException("Budget already rejected");
    }

    public void finish(Budget budget) throws DomainException {
        throw new DomainException("Budget can not be finished!");
    }


}
