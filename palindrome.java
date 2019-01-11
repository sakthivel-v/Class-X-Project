
import java.util.*;
public class palindrome
{
   void palindrome()
   {
    int d,c,r=0,n;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number");
    n=in.nextInt();
            c=n;
            do
            {
                d=n%10;
                r=r*10+d;
                n=n/10;
            }
            while(n!=0);
            if(r==c)
                System.out.println("The number is a palindrome");                    

            else
                System.out.println("The number is not a  palindrome");
    }
}
