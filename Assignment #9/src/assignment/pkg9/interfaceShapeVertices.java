
package assignment.pkg9;

public class interfaceShapeVertices implements interfaceShape
{
    protected char shape;
    
    public interfaceShapeVertices(char shape)
    {
        this.shape = shape;
    }
    
    public void setShape(char shape)
    {
        this.shape = shape;
    }
    public char getShape()
    {
        return shape;
    }
    
    public void getNumberOfVertices()
    {
        int vertices = 0;
        switch(shape)
        {
            case 'A':
                System.out.println("A circle has " + vertices + " vertices.");
                break;
            case 'B':
                vertices = 3;
                System.out.println("A triange has " + vertices + " vertices.");
                break;
            case 'C':
                vertices = 4;
                System.out.println("A square has " + vertices + " vertices.");
                break;
            case 'D':
                vertices = 5;
                System.out.println("A pentagon has " + vertices + " vertices.");
                break;
            case 'E':
                vertices = 6;
                System.out.println("A hexagon has " + vertices + " vertices.");
                break;
        }
    }
    public void showShape()
    {
        getNumberOfVertices();
    }
}
