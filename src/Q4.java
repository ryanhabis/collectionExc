import Q3.Customer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q4
{
    public static void main(String[] args)
    {
        demoAmazon();

    }
    public static void demoAmazon()
    {
        Product p = new Product("Chair",7.99);
        Product p1 = new Product("Chair2",7.99);

        Customer c = new Customer("Ryan.Habis@gmail.com","Ryan","Habis");
        Customer c1 = new Customer("Dylan.Habis@gmail.com","Dylan","Habis");

        Map<Customer, Set<Product>> orders = new HashMap<>();
        if (!orders.containsKey(c1))
        {
            orders.put(c1,new HashSet());

        }

        orders.get(c1).add(p);
        orders.get(c1).add(p1);

        System.out.println("Orders = " + orders);
    }
}
