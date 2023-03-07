
package fal18;

public abstract class SportShopRental
{
    private boolean newModel = false;
    protected double rentalCost = 25.0;
    private long rentalNumber = 1L;
    
    public boolean isNewModel()
    {
        return newModel;
    }
    
    public void setNewModel(boolean newModel)
    {
        this.newModel = newModel;
    }
    
    public double getRentalCost()
    {
        return rentalCost;
    }
    
    public void setRentalCost(double rentalCost)
    {
        this.rentalCost = rentalCost;
        if(rentalCost <= 0)
        {
            throw new IllegalArgumentException("Rental cost out of range");
        }
    }
    
    public long getRentalNumber()
    {
        return rentalNumber;
    }
    
    public void setRentalNumber(long rentalNumber)
    {
        this.rentalNumber = rentalNumber;
        if (rentalNumber < 1 || rentalNumber > 999999999999L)
        {
            throw new IllegalArgumentException("Rental number out of range.");
        }
    }
    
    @Override
    public String toString()
    {
        return String.format("Rental #%d", rentalNumber) + ", "
                + String.format("Cost: $%7.2f", rentalCost) + ", "
                + String.format("New: %b", newModel);
    }
    
    public abstract double lateCharge();
}