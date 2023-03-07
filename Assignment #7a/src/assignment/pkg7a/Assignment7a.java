/* 
Programmer Name: Nour Shinnawi
Assignment Start: 11/11/18 at 9:00 am
Assignment Completion: 11/11/18 at 2:30pm 
Total Hours for Assignment: 2 hours and 10 minutes
*/
package assignment.pkg7a;

public class Assignment7a 
{
    public static void main(String[] args) 
    {
        for (TrafficSignal name : TrafficSignal.values())
        {
            System.out.println("The traffic signal is " + name );
            System.out.println("The signal is " + name.getDuration()
                    + " seconds long.");
            System.out.printf("%n");
        }
    }
}
