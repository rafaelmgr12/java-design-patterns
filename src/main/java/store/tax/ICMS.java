package store.tax;

import store.budget.Budget;

import java.math.BigDecimal;

public class ICMS implements Taxes {
    public BigDecimal computeTax(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
