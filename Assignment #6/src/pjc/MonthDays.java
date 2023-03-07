
package pjc;

public class MonthDays 
{
    private int month;
    private int year;
    
    public MonthDays(int month, int year)
    {
        this.month = month;
        this.year = year;
        
        if (month < 1 || month > 12)
        {
            System.out.printf("Month must be between 1 and 12. Program terminating. %n");
            System.exit(0);
        }   
    } 
    public int getNumberOfDays()
    {
        int days = 0;
        switch(month)
        {
            case 1: 
                days = 31;
                break;
            case 2: 
                if(year % 100 == 0)
                {
                    if (year % 400 == 0)
                    {
                        days = 29;
                    }
                    else
                    {
                        days = 28;
                    }
                }
                else if (year % 4 == 0)
                {
                    days = 29;
                }
                else
                {
                    days = 28;   
                }
                break;
            case 3: 
                days = 31;
                break;
             case 4: 
                days = 30;
                break;
             case 5: 
                days = 31;
                break;
             case 6: 
                days = 30;
                break;
             case 7: 
                days = 31;
                break;
             case 8: 
                days = 31;
                break;
             case 9: 
                days = 30;
                break;
             case 10: 
                days = 31;
                break; 
             case 11: 
                days = 30;
                break;
             case 12: 
                days = 31;
                break;
        }
        return days;
    }
}
