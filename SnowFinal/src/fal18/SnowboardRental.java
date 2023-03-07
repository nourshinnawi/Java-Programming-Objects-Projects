
package fal18;

public class SnowboardRental extends SportShopRental
{
    private int size = 140;
    private boolean freestyle = true;
    
    public int getSize()
    {
        return size;
    }
    
    public void setSize(int size)
    {
        this.size = size;
        
        if (size < 50 || size > 180)
        {
            throw new IllegalArgumentException("Size is out of range.");
        }
    }
    
    public boolean isFreestyle()
    {
        return freestyle;   
    }
    
    public void setFreestyle(boolean freestyle)
    {
        this.freestyle = freestyle;
    }
    
    @Override
    public String toString()
    {
        String type;
        if(freestyle)
        {
            type = "freestyle";
        }
        else
        {
            type = "alpine";
        }
        return super.toString() + 
                String.format(", Size: %4d", size) + " cm, "
                + String.format("%s", type);
    }
        
    @Override
    public double lateCharge()
    {
        return rentalCost * .20;
    }
}
