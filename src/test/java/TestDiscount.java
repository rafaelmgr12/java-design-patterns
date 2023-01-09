import org.testng.annotations.Test;
import store.budget.Budget;
import store.discount.ComputeDiscount;

import java.math.BigDecimal;

import static org.testng.AssertJUnit.assertEquals;

public class TestDiscount {
    @Test
    public void testDiscount() {
        Budget budget = new Budget(new BigDecimal("100"), 1);
        ComputeDiscount computeDiscount = new ComputeDiscount();
        BigDecimal result = computeDiscount.compute(budget);
        assertEquals(new BigDecimal("0"), result);
    }
}
