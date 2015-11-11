package InheritanceDesign;


public class Car extends Property
{
    @Override
    public double getAssetValue()
    {
        return getValue() - getDebtAmount();
    }
    
    Car(String name, double debt, double value)
    {
        setName(name);
        setDebtAmount(debt);
        setValue(value);
    }
    
}
