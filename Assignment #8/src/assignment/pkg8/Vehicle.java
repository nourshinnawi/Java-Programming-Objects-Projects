
package assignment.pkg8;

public class Vehicle 
{
    protected int id;
    protected String model;
    protected float price;
    
    public Vehicle (int id, String model, float price)
    {
        this.id = id;
        this.model = model;
        this.price = price;
    }
    
    public void setInfo (int id, String model, float price)
    {
        this.id = id;
        this.model = model;
        this.price = price;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public String showVehicle()
    {
        return ("ID: " + id + "\n"
         + "Model: " + model + "\n"
         + "Price: " + price);
    }
    
}
