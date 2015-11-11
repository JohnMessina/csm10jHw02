package InheritanceDesign;


public class House extends Property
{
    @Override
    public double getAssetValue()
    {
        return getValue() - getDebtAmount();
    }
    
    House(String name, double debt, double value)
    {
        setName(name);
        setDebtAmount(debt);
        setValue(value);
    }
    
}
