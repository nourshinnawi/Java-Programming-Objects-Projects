
package fal18;

public class SnowMobileRental extends SportShopRental
{
    private int capacity = 1;
    private String vin = "1A234567890123456789";
    
    public int getCapacity()
    {
        return capacity;
    }
    
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
        
        if (capacity < 1 || capacity > 3)
        {
            throw new IllegalArgumentException("Capacity out of range.");
        }
    }
    
    public String getVin()
    {
        return vin;
    }
    
    public void setVin(String vin)
    {
        this.vin = vin;
        if(vin.length() > 20)
        {
            throw new IllegalArgumentException("Vin cannot be "
                    + "more than 20 characters.");
        }
    }
    
    @Override
    public String toString()
    {
        return super.toString() + 
                String.format(", Capacity: %1d", capacity) + " seat, "
                + String.format("Vin: %s", vin);
    }
    
    @Override
     public double lateCharge()
    {
        int percentage = (20 + capacity * 5);
        int total = (int) (rentalCost * percentage)/100;
        return total;
    }
}