/* 
Programmer Name: Nour Shinnawi
Assignment Start: 12/6/18 at 5:00 pm
Assignment Completion: 12/7/18 at 3:00 pm 
Total Hours for Assignment: 3 hours and 30 minutes
Comments: I'm aware that this program isn't very 
creative but I'm having trouble completely understanding
abstract classes and interfaces. I wanted to create
something a little more complicated but I'm not even sure
if I wrote and used the abstract class and interface correctly.
*/

package assignment.pkg9;

import java.util.Scanner;

public class Assignment9 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        char shape;
        
        System.out.print("Choose a letter between A-E: ");
        shape = input.nextLine().charAt(0);
        
        abstractShapeVertices s1 = new abstractShapeVertices(shape);
        
        System.out.print("This is the result using an abstract class: ");
        s1.showShape();
        
        System.out.printf("%n");
        
        System.out.print("Choose a letter between A-E: ");
        shape = input.nextLine().charAt(0);
        
        interfaceShapeVertices s2 = new interfaceShapeVertices(shape);
        
        System.out.print("This is the result using an interface: ");
        s2.showShape();
 
    }
    
}
