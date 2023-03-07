/* 
Programmer Name: Nour Shinnawi
Assignment Start: 12/8/18 at 2:00 pm
Assignment Completion: 12/8/18 at 4:00 pm 
Total Hours for Assignment: 2 hours
Comments: This assignment was not as hard
as I thought it would be and I appreciate 
that the last assignment before the final
project was not incredibly complicated.
*/

package assignment.pkg10;

import java.util.Scanner;

public class Assignment10 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int numMonth;
        int numYear;
      
        System.out.print("Enter the month (1=Janurary, 2=February, ..., 12=December): ");
        numMonth = input.nextInt();
      
        System.out.print("Enter the year: ");
        numYear = input.nextInt();
      
        MonthDays date = new MonthDays(numMonth, numYear);
        
        try
        {
            date.setMonthDays(numMonth, numYear);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf(e.getMessage());
            System.out.printf("%n");
            System.exit(0);
        }
       
        System.out.printf("%n");
        System.out.print(numMonth + "/" + numYear + " has ");
        System.out.printf(date.getNumberOfDays() + " days. %n");
    }   
}
