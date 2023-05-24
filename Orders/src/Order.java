import java.time.LocalDate;
import java.util.Objects;


public class Order {
    private int id;
    private String value;
    private LocalDate orderData ;

    public Order(int id, String value, LocalDate orderData) {
        this.id = id;
        this.value = value;
        this.orderData = orderData;
    }

    public int getId() {
            return id;
        }

        public String getValue() {
            return value;
        }

        public LocalDate getOrderData() {
            return orderData;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(value, order.value) && Objects.equals(orderData, order.orderData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, orderData);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", orderData=" + orderData +
                '}';
    }
}
