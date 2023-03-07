/* 
Programmer Name: Nour Shinnawi
Assignment Start: 10/6/18 at 3:00 pm
Assignment Completion: 10/6/18 at 8:00pm 
Total Hours for Assignment: 3 hours
*/

package assignment.pkg3;

import java.util.Scanner;

public class Assignment3 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int days;
        double salary = 0.01;
        double totalPay = 0;
        
         System.out.print("For how many days will the pay double? ");
         days = input.nextInt();
         
          while (days < 1)
          {
              System.out.printf("The number of days can not be less than 1.%n");
              System.out.print("For how many days will the pay double? ");
              days = input.nextInt();
          }
          while (days > 45)
          {
              System.out.printf("The number of days can not be more than 45.%n");
              System.out.print("For how many days will the pay double? ");
              days = input.nextInt();
          }
          
          System.out.printf("Day           Total Pay %n");
          System.out.printf("----------------------------------------%n");
          
         for (int totalDays = 1; totalDays <= days; totalDays++) 
          {
             System.out.printf(totalDays + "             $             " + salary + "%n");
             totalPay += salary;      
             salary = salary * 2;
          }
         
         System.out.printf("-----------------------------------------%n");
         System.out.printf("Total          $             %.2f" , totalPay);
         System.out.printf("%n");
    }
}
