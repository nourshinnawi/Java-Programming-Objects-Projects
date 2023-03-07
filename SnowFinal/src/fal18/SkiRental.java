
package fal18;

public class SkiRental extends SportShopRental
{
    private int size = 175;
    
    public int getSize()
    {
        return size;
    }
    
    public void setSize(int size)
    {
        this.size = size;
        
        if (size < 50 || size > 200)
        {
            throw new IllegalArgumentException("Size out of range.");
        }
    }
    
    @Override
    public String toString()
    {
        return super.toString() + String.format(", Size: %4d", size) + " cm";
    }
    
    @Override
    public double lateCharge()
    {
        return rentalCost *.10;
    }   
}
