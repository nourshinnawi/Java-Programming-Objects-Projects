/* 
Programmer Name: Nour Shinnawi
Assignment Start: 11/3/18 at 5:00 pm
Assignment Completion: 11/7/18 at 7:30pm 
Total Hours for Assignment: 4 hours and 30 minutes
*/

package pjc;

import java.util.Scanner;

public class Assignment6 
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
     
      System.out.printf("%n");
      System.out.print(numMonth + "/" + numYear + " has ");
      System.out.printf(date.getNumberOfDays() + " days. %n");
    }
}
