package store.tax;

import store.budget.Budget;

import java.math.BigDecimal;

public class ComputeTax {

    public BigDecimal computeTax(Budget bugdet, Taxes taxes) {
        return taxes.doComputeTax(bugdet);
    }
}
