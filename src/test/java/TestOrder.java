import org.testng.annotations.Test;
import store.budget.Budget;
import store.order.GenerateOrder;
import store.order.GenerateOrderHandler;
import store.order.Order;
import store.order.action.SaveOrderrInDB;
import store.order.action.SendOrderEmail;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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
    @Test
    public void createOrderWithActions(){
        String client = "John Doe";
        BigDecimal budgetValue = new BigDecimal("100");
        int quantityItems = 3;

        GenerateOrder generateOrder = new GenerateOrder(client, budgetValue, quantityItems);
        GenerateOrderHandler generateOrderHandler = new GenerateOrderHandler(List.of(new SaveOrderrInDB(), new SendOrderEmail()));
        generateOrderHandler.execute(generateOrder);
    }


}
