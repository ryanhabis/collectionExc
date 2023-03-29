package Q3;

import java.util.Objects;

public class Customer
{
    private String email;
    private String fName;
    private String lName;

    public Customer(String email, String fName, String lName)
    {
        this.email = email;
        this.fName = fName;
        this.lName = lName;
    }

    public Customer()
    {

    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getfName()
    {
        return fName;
    }

    public void setfName(String fName)
    {
        this.fName = fName;
    }

    public String getlName()
    {
        return lName;
    }

    public void setlName(String lName)
    {
        this.lName = lName;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getEmail(), customer.getEmail()) && Objects.equals(getfName(), customer.getfName()) && Objects.equals(getlName(), customer.getlName());
    }

    @Override
    public int hashCode()
    {

        int hash = 7;

        return Objects.hash(getEmail(), getfName(), getlName());
    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "email='" + email + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
