
import java.util.*;
public class neon
{
   void neon()
   {
    int p,s=0,d=0,n;
    Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
    n=in.nextInt();
    p=n*n;
            do
            {
                d=p%10;
                s=s+d;
                p=p/10;
            }
            while(p!=0);
            if(s==n)
                System.out.println("The number is a neon number");

            else
                System.out.println("The number is not a neon number"); 
            }
        }
