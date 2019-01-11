
import java.util.*;
public class sum_no
{
    void sum_no()
  {
   int sin=0,n;
   Scanner in=new Scanner(System.in);
   System.out.println("Enter a number");
   n=in.nextInt();
   
            while(n!=0)
            {
                sin=sin+(n%10);
                n=n/10;
            }
            System.out.println("The sum of the digits are ="+sin);
    }
}
