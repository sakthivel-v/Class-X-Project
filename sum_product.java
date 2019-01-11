
import java.util.*;
public class sum_product
{
  void sum_product ()
  {
    int sof=0,prod=1,dn=0,n;
    Scanner in=new Scanner(System.in);
     System.out.println("Enter a number");
     n=in.nextInt(); 
               while(n!=0)
               {
                   int dm=n%10;
                   sof+=dm;
                   prod*=dm;
                   n/=10;
                }
                   if(sof==prod)
                   {
                    System.out.println("It is a sum product number");
                   }
                    else
                    {
                      System.out.println("It is not a sum product number");
                    }
                        
    }
}
