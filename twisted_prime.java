
import java.util.*;
public class twisted_prime
{ 
   void twisted_prime()
   { 
    int rev=0,file=0;int is=1,n;
    Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        n=in.nextInt();
            for( is=1;is<=n;is++)
            {
                if(n%is==0)
                {
                    file++;
                }
            }
            if(file==2)
            {
                file=0;
                while(n!=0)
                {
                    int digit=n%10;
                    rev=rev*10+digit;
                    n=n/10;
                }
                for( is=1;is<=rev;is++);
                {
                    if(rev%is==0)
                    {
                        file++;
                    }
                }
                if(file==2)
                {
                    System.out.println("It is a  Twisted prime  number.");              

                }
                else 
                {
                    System.out.println("It is not a twisted prime number.");  

                }
            }
    }
}

