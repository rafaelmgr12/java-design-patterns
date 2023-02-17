package store.tax;

import store.budget.Budget;

import java.math.BigDecimal;

public class ICMS extends Taxes {

    public ICMS(Taxes otherTax) {
        super(otherTax);
    }
    @Override
    protected BigDecimal doComputeTax(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
