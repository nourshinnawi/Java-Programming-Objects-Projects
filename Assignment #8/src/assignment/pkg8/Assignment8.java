/* 
Programmer Name: Nour Shinnawi
Assignment Start: 11/20/18 at 1:00 pm
Assignment Completion: 11/20/18 at 4:00 pm 
Total Hours for Assignment: 3 hours
Comments: I'm not incredibly creative so this
is all I could come up with to demonstrate
inheritance. At first I was trying to make
the subclass for if the vehicle was electric
or not. So I made it a Boolean but it a little
bit complicated so I abandoned the idea. I 
wasn't sure how to execute it in the best way 
possible.
*/

package assignment.pkg8;

import java.util.Scanner;

public class Assignment8 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int vehicleId;
        String vehicleModel;
        float vehiclePrice;
        double vehicleTax = 0.20;
        
        System.out.print("Enter the Vehicle ID: ");
        vehicleId = input.nextInt();
        
        System.out.print("Enter the Vehicle Model: ");
        vehicleModel = input.next();
        
        System.out.print("Enter the Vehicle Price: ");
        vehiclePrice = input.nextFloat();
  
        VehicleTaxes v1 = new VehicleTaxes(vehicleId, vehicleModel,
                vehiclePrice, vehicleTax);
        
        System.out.printf("%n");
        System.out.println(v1.showVehicle());
    }
}
