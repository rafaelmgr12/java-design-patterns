import http.JavaHttpClient;
import store.RegisterBudget;
import store.budget.Budget;

import java.math.BigDecimal;

public class TestHttpAdapter {

    public void testHttpAdapter() {
        Budget budget = new Budget(new BigDecimal("100"), 1);
        budget.approve();
        budget.finish();

        RegisterBudget registerBudget = new RegisterBudget(new JavaHttpClient());
        registerBudget.register(budget);

    }

}
