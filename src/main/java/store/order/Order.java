package store.order;

import store.budget.Budget;

import java.time.LocalDateTime;

public class Order {

    private String client;
    private LocalDateTime date;
    private Budget budget;

    public Order() {
    }

    public Order(String client, LocalDateTime date, Budget budget) {
        this.client = client;
        this.date = date;
        this.budget = budget;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
}
