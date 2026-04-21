import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Покупатель " + customer + ", Заказ: " + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        if (!Objects.equals(customer, order.customer)) { // if customer !=
            return false;
        }

        if (basket == null && order.basket == null) {
            return true;
        }
        if (basket == null || order.basket == null) {
            return false;
        }
        if (basket.length != order.basket.length) {
            return false;
        }
        for (byte i = 0; i < basket.length; i++) {
            Product a1 = basket[i];
            Product a2 = order.basket[i];

            if (a1 == null && a2 == null) {
                continue;
            }
            if (a1 == null || a2 == null) {
                return false; // or break
            }
            if (!a1.equals(a2)) {
                break; // or return false
            }
        }
        return true;
    }

}
