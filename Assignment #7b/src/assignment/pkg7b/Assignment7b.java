/* 
Programmer Name: Nour Shinnawi
Assignment Start: 11/12/18 at 8:00 am
Assignment Completion: 11/12/18 at 11:00 am 
Total Hours for Assignment: 3 hours
*/

package assignment.pkg7b;

import java.util.Scanner;
import java.math.BigDecimal;

public class Assignment7b 
{
    public static void main(String[] args)
    {
        Account account1 = new Account("Jane Green", BigDecimal.valueOf(50.00));
        Account account2 = new Account("John Blue", BigDecimal.valueOf(-7.53));
        
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the deposit amount for Account #1: ");
        BigDecimal depositAmount = input.nextBigDecimal();
        System.out.printf("%nadding %.2f to Account #1's balance%n%n",
                depositAmount);
        account1.deposit(depositAmount);
        
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());
        
        System.out.print("Enter deposit amount for Account #2: ");
        depositAmount = input.nextBigDecimal();
        System.out.printf("%nadding %.2f to Account #2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount);
        
        System.out.printf("%s balance: $%9.2f%n",
                account1.getName(), account1.getBalance()); 
        System.out.printf("%s balance: $%9.2f%n%n",
                account2.getName(), account2.getBalance()); 
    }
}
