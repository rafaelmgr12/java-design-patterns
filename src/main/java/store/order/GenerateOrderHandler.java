package store.order;

import store.budget.Budget;
import store.order.action.SaveOrderrInDB;
import store.order.action.SendOrderEmail;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GenerateOrderHandler {

    public GenerateOrderHandler() {
        // TODO document why this constructor is empty
    }

    public void execute(GenerateOrder generateOrder){
        Budget budget = new Budget(generateOrder.getBudgetValue(), generateOrder.getQuantityItems());
        LocalDateTime date = LocalDateTime.now();

        Order order = new Order(generateOrder.getClient(), date, budget);

        SendOrderEmail sendOrderEmail = new SendOrderEmail();
        sendOrderEmail.execute(order);
        SaveOrderrInDB saveOrderrInDB = new SaveOrderrInDB();
        saveOrderrInDB.execute(order);
    }
}
