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

    @Test
    public void testDiscountWithMoreThanFiveItems() {
        Budget budget = new Budget(new BigDecimal("100"), 6);
        ComputeDiscount computeDiscount = new ComputeDiscount();
        BigDecimal result = computeDiscount.compute(budget);
        assertEquals(new BigDecimal("10.0"), result);
    }

    @Test
    public void testDiscountWithMoreThanFiveHundredReais() {
        Budget budget = new Budget(new BigDecimal("600"), 1);
        ComputeDiscount computeDiscount = new ComputeDiscount();
        BigDecimal result = computeDiscount.compute(budget);
        assertEquals(new BigDecimal("30.00"), result);
    }

    @Test
    public void testDiscountWithMoreThanFiveItemsAndMoreThanFiveHundredReais() {
        Budget budget = new Budget(new BigDecimal("600"), 6);
        ComputeDiscount computeDiscount = new ComputeDiscount();
        BigDecimal result = computeDiscount.compute(budget);
        assertEquals(new BigDecimal("30.00"), result);
    }

    @Test
    public void testDiscountWithMoreThanFiveItemsAndMoreThanFiveHundredReaisAndMoreThanFiveItemsAndMoreThanFiveHundredReais() {
        Budget budget = new Budget(new BigDecimal("600"), 6);
        ComputeDiscount computeDiscount = new ComputeDiscount();
        BigDecimal result = computeDiscount.compute(budget);
        assertEquals(new BigDecimal("30.00"), result);
    }
}
