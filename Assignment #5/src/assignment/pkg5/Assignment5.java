/* 
Programmer Name: Nour Shinnawi
Assignment Start: 10/27/18 at 5:00 pm
Assignment Completion: 10/30/18 at 2:00pm 
Total Hours for Assignment: 5 hours and 30 minutes
Comments: I included a lot of methods in this assignment
because I was trying to get practice using them with arrays.
I had a hard time trying to pass arrays to functions in C++
but doing it in Java seemed a lot easier and less complicated
to understand. 
*/
package assignment.pkg5;

import java.util.Scanner;

public class Assignment5 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many numbers of the type double do"
                + " you want to store in your array?  ");
        int size = input.nextInt();
        
        double numbers[] = new double[size];
        
        for (int i=0; i<numbers.length; i++)
        {
            System.out.print("Enter a value #" + (i+1) + ": ");
            numbers[i] = input.nextDouble();        
        }
        
        displayResults(numbers);
    } 
    public static double maxValue(double numbers[])
    {
        double maximum = numbers[0];
        for (int i=1; i<numbers.length; i++)
        {
            if (numbers[i] > maximum)
            {
                maximum = numbers[i];
            }
        }
        return maximum;
    }
    public static double minValue(double numbers[])
    {
        double minimum = numbers[0];
        for (int i=1; i<numbers.length; i++)
        {
            if (numbers[i] < minimum)
            {
                minimum = numbers[i];
            }
        }
        return minimum;
    }
    public static double avgValue(double numbers[])
    {
         double average = 0;
         
          for (int i=0; i<numbers.length; i++)
          {
             average = average + numbers[i]; 
          }
         double avg = average / numbers.length;
       
         return avg;
    }
    public static double stdDevSample(double numbers[])
    {
        double sum = 0;
        double stdDev = 0;
        
        for (double value : numbers)
        {
            sum += value;
        }
        
        double num = sum/numbers.length;
        
        for (double value : numbers)
        {
            stdDev += Math.pow(value - num, 2);
        }
        return Math.sqrt(stdDev/(numbers.length-1));
    }
    public static double stdDevPopulation(double numbers[])
    {
        double sum = 0;
        double stdDev = 0;
        
        for (double value : numbers)
        {
            sum += value;
        }
        
        double num = sum/numbers.length;
        
        for (double value : numbers)
        {
            stdDev += Math.pow(value - num, 2);
        }
        return Math.sqrt(stdDev/(numbers.length));
    }
    public static void displayResults(double numbers[])
    {
        System.out.printf("%nThe statistics for your user entered array is: %n");
        System.out.printf("----------------------------------------------%n");
        System.out.printf("\t\t\tMinimum: %10.3f%n", minValue(numbers));
        System.out.printf("\t\t\tMaximum: %10.3f%n", maxValue(numbers));
        System.out.printf("\t\t\tAverage: %10.3f%n", avgValue(numbers));
        System.out.printf("Standard Deviation (population): %10.3f%n", stdDevPopulation(numbers));
        System.out.printf("    Standard Deviation (sample): %10.3f%n", stdDevSample(numbers));
    }
}
