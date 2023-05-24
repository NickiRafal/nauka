import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1,"Książka Kucharska", LocalDate.of(2023,5,8));
        Order order2 = new Order(2,"Podróże małe i duże",LocalDate.of(2023,5,7));
        Order order3 = new Order(3,"Na jagody",LocalDate.of(2023,5,4));
        Order order4 = new Order(3,"Na jagody",LocalDate.of(2023,5,4));
        Order order5 = new Order(2,"Podróże małe i duże",LocalDate.of(2023,5,7));
        HashSet<Order> hashSet = new HashSet<>();

        hashSet.add(order1);
        hashSet.add(order2);
        hashSet.add(order3);
        hashSet.add(order4);
        hashSet.add(order5);

       // System.out.println(hashSet.size());

        String a;
        for (Order e:hashSet) {
            System.out.println("Id zamówienia "+e.getId()+" Tytuł \""+e.getValue()+"\" Data zamówienia "+e.getOrderData());
        }
    }
}