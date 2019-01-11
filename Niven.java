 import java.util.*;
public class Niven
{
   
   void niven()
   {
       int n,p,d,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        n=in.nextInt();       
            p=n;
            do
            {
                d=n%10;
                sum=sum+d;
                n=n/10;
            }
            while(n!=0);
            if(p%sum==0)
                System.out.println("The number is niven number");
            else
                System.out.println("The number is not a niven number"); 
}
}
