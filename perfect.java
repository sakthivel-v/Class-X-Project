
import java.util.*;
public class perfect
{
    void perfect()
   {
       
    int l,m=0,n;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number");
    n=in.nextInt(); 
            for(l=1;l<n;l++)
            {
                if(n%l==0)
                    m=m+l;
            }
            if(m==n)
                System.out.println("The number is a  perfect number");

            else
                System.out.println("The number is not a perfect number");
    }
}
