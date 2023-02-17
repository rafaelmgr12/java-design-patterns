package store;

import store.http.HttpAdapter;
import store.budget.Budget;

import java.util.Map;

public class RegisterBudget {
    private HttpAdapter http;

    public RegisterBudget(HttpAdapter http) {
        this.http = http;
    }

    public void register(Budget budget) {
      String url = "http://api.externa.com/orcamento/";
      Map<String, Object> data = Map.of(
                "value", budget.getValue(),
                "Itemsquantity", budget.getItemsQuantity()
        );
      http.post(url, data);

    }
}

