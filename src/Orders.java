import Q3.Customer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Orders
{
    private Map<Customer, Set<Product>> orders;

    public Orders()
    {
        Map<Customer, Set<Product>> orders = new HashMap<>();
    }

    public void addOrders(Customer c1, Product p1)
    {
        if (!orders.containsKey(c1))
        {
            orders.put(c1,new HashSet());

        }
        orders.get(c1).add(p1);
    }
}
