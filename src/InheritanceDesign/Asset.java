package InheritanceDesign;

/**
 *
 * @author mllroal
 */
abstract public class Security extends Asset
{
    public void setPrice(double pr)
    {
        price = pr;
    }
    
    public void setQuantity(double q)
    {
        quantity = q;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public double getQuantity()
    {
        return quantity;
    }
    public double getAssetValue()
    {
        return quantity * price;
    }
    
    private double price, quantity;
}
