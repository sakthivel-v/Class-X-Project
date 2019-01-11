
import java.util.*;
public class composite
{
   void composite()
   {
       int b,z,i,n;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter a number");
       n=in.nextInt();
   
            z=0;
            for(i=2;i<n;i++)
                if(n%i==0)
                 z=z+1;
            if(z>=1)
                System.out.println("The number is a composite number");

            else

                System.out.println("The number is not a composite number");
            }
        }