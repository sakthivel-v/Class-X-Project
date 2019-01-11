
import java.util.*;
public class typical
{
     void typical()
   {
        int so=0,se=0,n;
        int d;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        n=in.nextInt();
            do
            {
                d=n%10;
                if(d%2!=0)
                    so=so+d;
                else if(d%2==0)
                    se=se+d;
                n=n/10;
            }
            while(n!=0);
            System.out.println("The sum of the  odd no.="+so);

            System.out.println("The sum of the  even no.="+se);

    }
}
