/* 
Programmer Name: Nour Shinnawi
Assignment Start: 12/6/18 at 5:00 pm
Assignment Completion: 12/7/18 at 3:00 pm 
Total Hours for Assignment: 3 hours and 30 minutes.
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
