
import java.util.*;
public class special
{
  void special()
  {
   int ink=0,dc,ss=0,fact=0,n;
   Scanner in=new Scanner(System.in);
   System.out.println("Enter a number");
   n=in.nextInt(); 
            ink=n;
            while(ink>0)
            {
                dc=ink%10;
                ink/=10;
                for(int an=1;an<=dc;an++)
                {
                    fact*=an;
                }
                ss+=fact;
                fact=0;
            }
            if(ss==n)
            {
                System.out.println("Special Number");
            }
            else
           {
                System.out.println("Not a Special Number");

           }
    }
}
