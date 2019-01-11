
import java.util.*;
public class armstrong
{
    void armstrong()
   {
    int a,num,s=0,n;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number");
    n=in.nextInt();
            num=n;
            while(n>0)
            {
                a=n%10;
                s=s+a*a*a;
                n=n/10;
            } 
            if(num==s)
                System.out.println("The number is a  amstrong number");

            else
                System.out.println("The number is not  a amstrong number");

}
}
