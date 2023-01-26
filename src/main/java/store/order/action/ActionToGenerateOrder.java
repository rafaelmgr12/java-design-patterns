package store.order.action;

import store.order.Order;

public interface ActionToGenerateOrder {
    void execute(Order order);
}
