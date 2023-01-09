package store.budget;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int itemsQuantity;

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public Budget(BigDecimal value, int itemsQuantity) {
        this.value = value;
        this.itemsQuantity = itemsQuantity;
    }

    public Budget(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
