package store.tax;

import store.budget.Budget;

import java.math.BigDecimal;

public class ISS extends Taxes{
    public  ISS(Taxes otherTax) {
        super(otherTax);
    }

    public BigDecimal doComputeTax(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
}
