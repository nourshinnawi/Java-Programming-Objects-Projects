
package assignment.pkg9;

public abstract class abstractShape 
{
    protected char shape;
    
    public abstractShape(char shape)
    {
        this.shape = shape;
    }
    public abstract void setShape(char shape);
    public abstract char getShape();
    public abstract void getNumberOfVertices();
    public abstract void showShape();
}
