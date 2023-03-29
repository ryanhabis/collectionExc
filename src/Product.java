import java.util.Objects;

public class Product
{
    private String item;
    private double price;

    public Product(String item, double price)
    {
        this.item = item;
        this.price = price;
    }
    public Product()
    {

    }

    public String getItem()
    {
        return item;
    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getItem(), product.getItem()) && Objects.equals(getPrice(), product.getPrice());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getItem(), getPrice());
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }
}
