package store.order;

import store.budget.Budget;
import store.order.action.ActionToGenerateOrder;
import store.order.action.SaveOrderrInDB;
import store.order.action.SendOrderEmail;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {

    private List<ActionToGenerateOrder> actions;

    public GenerateOrderHandler(List<ActionToGenerateOrder> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder generateOrder){
        Budget budget = new Budget(generateOrder.getBudgetValue(), generateOrder.getQuantityItems());
        LocalDateTime date = LocalDateTime.now();

        Order order = new Order(generateOrder.getClient(), date, budget);

        actions.forEach(a -> a.execute(order));
    }
}
