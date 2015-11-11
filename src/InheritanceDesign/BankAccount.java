

package InheritanceDesign;

public class BankAccount extends Asset 
{
    @Override
    public double getAssetValue()
    {
        return value;
    }
    
    private double value;
    
    BankAccount(String name1, double value1)
    {
        setName(name1);
        value = value1;
    }
}
