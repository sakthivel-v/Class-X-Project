import java.util.*;
public class prime
{
     void prime()
   {
       int a,c=0,n;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter a number");
        n=in.nextInt();
            for(a=1;a<=n;a++)
            {
                if(n%a==0)
                    c=c+1;
            }
            if(c==2)
           
                System.out.println("The number is a prime number");

            else
                System.out.println("The number is not a prime number");
            }
        }
