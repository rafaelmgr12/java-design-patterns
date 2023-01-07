package store.tax;

import store.budget.Budget;

import java.math.BigDecimal;

public interface Taxes {
    BigDecimal computeTax(Budget budget);
}
