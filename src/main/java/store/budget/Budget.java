package store.budget;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int itemsQuantity;

    private String situation;

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public Budget(BigDecimal value, int itemsQuantity) {
        this.value = value;
        this.itemsQuantity = itemsQuantity;
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscountValue = BigDecimal.ZERO;
        if (situation.equals("EM ANALISE")) {
            extraDiscountValue = new BigDecimal("0.05");
        } else if (situation.equals("APROVADO")) {
            extraDiscountValue = new BigDecimal("0.02");
        }
        this.value = this.value.subtract(extraDiscountValue);
    }

    public void approve(){
        this.situation = "APROVADO";
    }
    public Budget(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
