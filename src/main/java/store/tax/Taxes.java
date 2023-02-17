package store.tax;

import store.budget.Budget;

import java.math.BigDecimal;

public abstract class Taxes {
    private Taxes otherTax;

    public Taxes(Taxes otherTax) {
        this.otherTax = otherTax;
    }

    protected abstract BigDecimal doComputeTax(Budget budget);

    public BigDecimal computeTax(Budget budget) {
        BigDecimal tax = doComputeTax(budget);
        BigDecimal otherTaxValue = BigDecimal.ZERO;
        if (otherTax != null) {
            otherTaxValue = otherTax.doComputeTax(budget);
        }
        return tax.add(otherTaxValue);
    }
}
