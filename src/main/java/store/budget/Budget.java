package store.budget;

import store.budget.situation.BudgetSituation;
import store.budget.situation.Finished;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int itemsQuantity;

    private BudgetSituation situation;

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public Budget(BigDecimal value, int itemsQuantity) {
        this.value = value;
        this.itemsQuantity = itemsQuantity;
        this.situation = new Finished();
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscount = this.situation.computeExtraDiscount(this);
        this.value = this.value.subtract(extraDiscount);

    }

    public void approve() {
        this.situation.approve(this);
    }

    public void reject() {
        this.situation.reject(this);
    }

    public void finish() {
        this.situation.finish(this);
    }

    public Budget(BigDecimal value) {
        this.value = value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setItemsQuantity(int itemsQuantity) {
        this.itemsQuantity = itemsQuantity;
    }

    public BudgetSituation getSituation() {
        return situation;
    }

    public void setSituation(BudgetSituation situation) {
        this.situation = situation;
    }

    public BigDecimal getValue() {
        return value;
    }


}
