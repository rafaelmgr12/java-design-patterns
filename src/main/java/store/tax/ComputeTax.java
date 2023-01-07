package store.tax;

import store.budget.Budget;

import java.math.BigDecimal;

public class ComputeTax {

    public BigDecimal computeTax(Budget bugdet, Taxes taxes) {
        switch (taxes) {
            case ICMS:
                return bugdet.getValue().multiply(new BigDecimal("0.1"));
            case ISS:
                return bugdet.getValue().multiply(new BigDecimal("0.06"));
            default:
                return BigDecimal.ZERO;
        }
    }
}
