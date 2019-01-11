
import java.util.*;
public class Automorphic
{
   void automorphic()
   {
       int j,f=0,n;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter a number");
       n=in.nextInt();
            j=n*n;
            do
            {
                if(n%10!=j%10)
                {
                    f=1;
                    break;
                }
                else 
                {
                    n=n/10;
                    j=j/10;
                }
            }
            while(n>0);
            if(f==0)
                System.out.println("The number is a automorphic number");

            else
                System.out.println("The number is not a automorphic number");
            
            }
        }