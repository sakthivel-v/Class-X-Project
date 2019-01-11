 import java.util.*;
public class magic
{
     void magic ()
  {
    int n,su=0,nu;
    Scanner in=new Scanner(System.in);
     System.out.println("Enter a number");
     n=in.nextInt(); 
     nu=n;
        while(nu>9)
        {
            su=nu;int st=0;
            while(su!=0)
            {
                st=st+(su%10);
                su=su/10;
            }
            nu=st;
        }
        if(nu==1)
        {
            System.out.println(n+" is a Magic Number.");

        }
        else
        {
            System.out.println(n+" is not a Magic Number."); 
        }
    }
}
