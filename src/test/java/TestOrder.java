import org.testng.annotations.Test;
import store.budget.Budget;
import store.order.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.testng.AssertJUnit.assertEquals;

public class TestOrder {


    @Test
    public void createOrder() {
        Order order = new Order();
        order.setClient("John Doe");
        order.setDate(LocalDateTime.now());
        order.setBudget(new Budget(new BigDecimal("100"),1));

        assertEquals("John Doe", order.getClient());
        assertEquals(LocalDateTime.now().getDayOfMonth(), order.getDate().getDayOfMonth());
        assertEquals(new BigDecimal("100"), order.getBudget().getValue());
    }


}
