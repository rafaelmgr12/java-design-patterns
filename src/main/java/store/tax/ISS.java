package store.tax;

import store.budget.Budget;

import java.math.BigDecimal;

public class ISS implements Taxes{
    @Override
    public BigDecimal computeTax(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
}
