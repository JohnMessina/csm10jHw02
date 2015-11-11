
package InheritanceDesign;


abstract public class Property extends Asset
{
    public double getDebtAmount()
    {
        return debtAmount;
    }
    
    public void setDebtAmount(double debt)
    {
        debtAmount = debt;
    }
    
    public double getValue()
    {
        return value;
    }
    
    public void setValue(double val)
    {
        value = val;
    }
    private double debtAmount;
    private double value;
}
