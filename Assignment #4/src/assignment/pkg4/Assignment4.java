/* 
Programmer Name: Nour Shinnawi
Assignment Start: 10/16/18 at 3:00 pm
Assignment Completion: 10/20/18 at 4:00pm 
Total Hours for Assignment: 8 hours
*/

package assignment.pkg4;

import java.util.Scanner;

public class Assignment4 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       int maxInt;
       System.out.print("Enter the largest number to try to display: ");
       maxInt = input.nextInt();

       while (maxInt < 2)
       {
           System.out.printf("The number cannot be less than 2. %n");
           System.out.print("Enter the largest number to try to display: ");
           maxInt = input.nextInt();
       }
       while (maxInt > 100000)
       {
           System.out.printf("The number cannot be more than 100000. %n");
           System.out.print("Enter the largest number to try to display: ");
           maxInt = input.nextInt();
       }
       
       for(int number = 2;number <= maxInt;number++)
       {
           if(isPerfect(number))
           {
               System.out.printf(number + " is perfect.%n");
               System.out.print("       Factors: ");
               
               for(int i = 1;i < number; i++)
               {
                   if (number % i == 0)
                   {
                       System.out.print(i + " ");
                   }
               }
               System.out.printf("%n");
           }
       }
    }
    public static Boolean isPerfect(int number)
    {
        int sum = 0;
        
        for(int i = 1;i < number;i++)
        {
            if (number % i == 0)
            {
                sum += i;
            }
        }
        return sum == number;
    }
}
