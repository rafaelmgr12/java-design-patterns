import org.testng.annotations.Test;
import store.budget.Budget;
import store.tax.ComputeTax;
import store.tax.ICMS;
import store.tax.ISS;

import java.math.BigDecimal;

import static org.testng.AssertJUnit.assertEquals;

public class TestTaxes {
    @Test
    public void testComputeTaxICMS() {

        Budget budget = new Budget(new BigDecimal("100"),1);
        ComputeTax computeTax = new ComputeTax();
        BigDecimal result = computeTax.computeTax(budget, new ICMS());
        assertEquals(new BigDecimal("10.0"), result);
    }
    @Test
    public void testComputeTaxISS() {

        Budget budget = new Budget(new BigDecimal("100"),1);
        ComputeTax computeTax = new ComputeTax();
        BigDecimal result = computeTax.computeTax(budget, new ISS());
        assertEquals(new BigDecimal("6.00"), result);
    }
}
