import java.util.*;
public class mixed
{
    void mixed()
   {
    int spe=0,sn=0,spo=0,n;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number");
    n=in.nextInt();
     int d;      
            do
            {
                d=n%10;
                if(d%2!=0)
                    sn=sn+d;
                else               
                    spo=spo+d;                
                n=n/10;
            }               
            while(n!=0);                                                  
            System.out.println("The sum of the positive odd no.="+spo);

            System.out.println("The sum of the Positive even n.="+sn);
    }
}
