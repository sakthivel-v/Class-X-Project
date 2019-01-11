
import java.util.*;

public class buzz
{
     void buzz()
  {
    int n;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number");
    n=in.nextInt();
    if (n% 10 == 7 || n% 7 == 0)
        {
            System.out.println("Entered	number " + n+ " is a Buzz number.");

        }
        else
        {
            System.out.println("Entered number " + n+ " is not a Buzz number.");

        }
    }
}
