
package assignment.pkg8;

public class VehicleTaxes extends Vehicle
{
    protected double tax;
    
    public VehicleTaxes(int id, String model, float price, double tax)
    {
        super(id, model, price);
        this.tax = tax;
    }
    
    public void setInfo(int id, String model, float price, double tax)
    {
        setInfo(id, model, price);
        this.tax = tax;
    }
    
    @Override
    public float getPrice()
    {
        return (float) (price * tax);
    }
    
    public float totalCost()
    {
        return getPrice() + price;
    }
    
    @Override
    public String showVehicle()
    {
       return (super.showVehicle() + "\n"
               + "Tax amount: " + getPrice()
               + "\n" + "Total Cost: " + totalCost());
    }
}
