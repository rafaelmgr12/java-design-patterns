package store.order;

import store.budget.Budget;

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

        System.out.println("Salvando pedio no banco de dados");
        System.out.println(order);
        System.out.println("Enviando e-mail com dados do novo pedido");


    }
}
