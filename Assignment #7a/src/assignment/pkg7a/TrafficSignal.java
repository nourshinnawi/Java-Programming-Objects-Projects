
package assignment.pkg7a;

public enum TrafficSignal 
{
    RED(50), GREEN(60), YELLOW(5),
    WALK(40), DONT_WALK(15);
    
    private int duration;
    
    TrafficSignal(int duration)
    {
        this.duration = duration;
    }
    
    public int getDuration()
    {
        return duration;
    }
}
