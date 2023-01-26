package store.order;

import store.budget.Budget;
import store.order.action.SaveOrderrInDB;
import store.order.action.SendOrderEmail;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class GenerateOrder {

    private String client;
    private BigDecimal budgetValue;
    private int quantityItems;

    public GenerateOrder(String client, BigDecimal budgetValue, int quantityItems) {
        this.client = client;
        this.budgetValue = budgetValue;
        this.quantityItems = quantityItems;
    }

    public void execute(){
        Budget budget = new Budget(this.budgetValue, this.quantityItems);
        LocalDateTime date = LocalDateTime.now();

        Order order = new Order(this.client, date, budget);

        SendOrderEmail sendOrderEmail = new SendOrderEmail();
        sendOrderEmail.execute(order);
        SaveOrderrInDB saveOrderrInDB = new SaveOrderrInDB();
        saveOrderrInDB.execute(order);



    }
}
