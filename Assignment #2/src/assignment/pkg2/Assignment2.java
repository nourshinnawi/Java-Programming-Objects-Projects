/* 
Programmer Name: Nour Shinnawi
Assignment Start: 10/3/18 at 2:00 pm
Assignment Completion: 10/3/18 at 10:00pm 
Total Hours for Assignment: 2 hours and 20 minutes
*/
package assignment.pkg2;

import java.util.Scanner;

public class Assignment2 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int value1;
        int value2;
        int value3;
        int value4;
        int maximum;
        int minimum;

        System.out.print("Enter the first value: ");
        value1 = input.nextInt();

        System.out.print("Enter the second value: ");
        value2 = input.nextInt();

        System.out.print("Enter the third value: ");
        value3 = input.nextInt();

        System.out.print("Enter the fourth value: ");
        value4 = input.nextInt();
        
        maximum = value1;
        minimum = value1;

        if(value2 > maximum)
        {
            maximum = value2;
        }
        if(value3 > maximum)
        {
            maximum = value3;
        }
        if(value4 > maximum)
        {
            maximum = value4;
        }
        if(value2 < minimum)
        {
            minimum = value2;
        }
        if (value3 < minimum)
        {
            minimum = value3;
        }
        if (value4 < minimum)
        {
            minimum = value4;
        }
        
        System.out.printf("The values entered: %d", value1);
        System.out.printf(", %d", value2);
        System.out.printf(", %d", value3);
        System.out.printf(", %d", value4);
        System.out.printf(" have a minimum value %d", minimum);
        System.out.printf(" and maximum value %d%n", maximum);
    }   
}
