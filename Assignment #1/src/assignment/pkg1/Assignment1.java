/* 
Programmer Name: Nour Shinnawi
Assignment Start: 9/16/18 at 1:00 pm
Assignment Completion: 9/16/18 at 9:00pm 
Total Hours for Assignment: 2 hours and 20 minutes
*/
package assignment.pkg1;

import java.util.Scanner;

public class Assignment1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the month: ");
        String month = input.nextLine();
        
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        
        System.out.print("Enter the total amount collected in sales: ");
        double amtCollected = input.nextDouble();
        
        double sales = amtCollected / 1.0920;
        double countySalesTax = sales * .0145;
        double stateSalesTax = sales * .0775;
        double totalSalesTax = countySalesTax + stateSalesTax;
        
        System.out.printf("Month: %s %d%n", month, year);
        System.out.printf("------------------------------");
        System.out.printf("%nTotal Collected:    $%.2f%n", amtCollected);
        System.out.printf("Sales:              $%.2f%n", sales);
        System.out.printf("County Sales Tax:     $%.2f%n", countySalesTax);
        System.out.printf("State Sales Tax:     $%.2f%n", stateSalesTax);
        System.out.printf("Total Sales Tax:     $%.2f%n", totalSalesTax);
    }
    
}
