package store.order.action;

import store.order.Order;

public class SendOrderEmail implements ActionToGenerateOrder{
    public void execute(Order order) {
        System.out.println("Enviando e-mail com dados do novo pedido");
    }
}
