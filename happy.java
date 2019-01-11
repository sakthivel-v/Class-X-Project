

import java.util.*;
public class happy
{
   
   void happy()
   {
       int r=0,n,d;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter a number");
        n=in.nextInt();
        r=n;
            do
            {
                n=r;r=0;
                do
                {
                    d=n%10;
                    r=r+d*d;
                    n=n/10;
                }
                while(n>0);
            }
            while(r>9);
            if(r==1)
                System.out.println("The number is a happy number"); 
            else
            System.out.println("The number is not a  happy number");
    }
}

   