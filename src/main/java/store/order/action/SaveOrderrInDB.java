package store.order.action;

import store.order.Order;

public class SaveOrderrInDB implements ActionToGenerateOrder{
    public void execute(Order order) {
        System.out.println("Salvando pedio no banco de dados");
    }
}
