
import java.util.*;
public class smallest_greatest
{
    void  smallest_greatest()
  {
      int i,min,max;
     Scanner in=new Scanner(System.in);
     int n[]=new int[10];
     for(i=0;i<=10;i++)
     {
          System.out.println("Enter the number in the cell:");
          n[i]=in.nextInt();
     }
    
            max=n[0];min=n[0];
            for(i=0;i<10;i++)
            {
                if(n[i]>max)
                max=n[i];
                if(n[i]<min)
                min=n[i];
            }
            
            System.out.println("The greatest of the array elements is="+max);
            System.out.println("The smallest number of the array elements is="+min);
        }
    }
            
            
           
