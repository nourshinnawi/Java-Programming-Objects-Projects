
package assignment.pkg7b;

import java.math.BigDecimal;

public class Account
{   
   private String name;
   private BigDecimal balance;
   
   public Account(String name, BigDecimal balance) 
   {
      this.name = name;

      if (balance.intValue() > 0.0) 
      {
         this.balance = balance;
      }
      if (balance.intValue() < 0.0) 
      {
         balance = new BigDecimal(0); 
         this.balance = balance;
      }
   }

   public void deposit(BigDecimal depositAmount) 
   {      
      if (depositAmount.intValue() > 0.0) 
      {
         balance = balance.add(depositAmount);
      }
   }

   public BigDecimal getBalance()
   {
      return balance; 
   } 

   public void setName(String name)
   {
      this.name = name; 
   } 
   
   public String getName()
   {
      return name; 
   } 
}