import java.io.*;
public class NUMBERS
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int w,n;
        String ch="Y";
        do
        {
            System.out.println("\t==========================================================");
            System.out.println("\t||THIS IS A MENU DRIVEN PROGRAM TO EXECUTE THE DIFFERENT||\n\t||TYPES OF NUMBERS ACCORDIMG TO THE USER'S CHOICE\t||"); 
            System.out.println("\t==========================================================");
            System.out.println("\n\t\tMENU OF NUMBERS IS GIVEN BELOW:-"); 
            System.out.println("\nEnter 1 for Niven Number\t\tEnter 11 for Perfect Number");
            System.out.println("Enter 2 for Happy Number\t\tEnter 12 for Smallest Greatest Number");
            System.out.println("Enter 3 for Prime Number\t\tEnter 13 for Sum Number");
            System.out.println("Enter 4 for Magic Number\t\tEnter 14 for Mixed Number");
            System.out.println("Enter 5 for Neon Number                 Enter 15 for Twisted Prime Number");
            System.out.println("Enter 6 for Palindrome Number\t\tEnter 16 for Typical Number");
            System.out.println("Enter 7 for Armstrong Number\t\tEnter 17 for Sum Product Number");
            System.out.println("Enter 8 for Automorphic Number\t\tEnter 18 for Special Number");
            System.out.println("Enter 9 for Even Number                 Enter 19 for Buzz Number");
            System.out.println("Enter 10 for Odd Number                 Enter 20 for Composite Number");
            System.out.println("\n\t\tENTER YOUR CHOICE:-");
            w=Integer.parseInt(in.readLine());
            System.out.println("\n\tTHE NUMBER YOU HAVE ENTERED IS: "+w);       
          switch(w)
            {
            case 1:// A program to check niven number            
            do 
            {            
                Niven ob=new Niven();
                ob.niven();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));
            break;
            case 2:               
            do
            {
                 happy obf=new happy();
                obf.happy();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));
            break;
            case 3:
            do
            {
                 prime on=new prime();
                 on.prime();
                 System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                 ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));           
            break;
            case 4:
            do
            {
                magic obd=new magic();
                obd.magic();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));            
            break;
            case 5:
            do
            {
                neon obg=new neon();
                obg.neon();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));                        
            break;
            case 6:
            do
            {
               
                palindrome obs=new palindrome();
                obs.palindrome();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));           
            break;
            case 7:
            do
            {
                armstrong obr=new armstrong();
                obr.armstrong();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));            
            break;
            case 8:
            do
            {
                Automorphic obl=new Automorphic();
                obl.automorphic();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));            
            break;
            case 9:
            do
            {
                 even obt=new even();
                 obt.even();
                 System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                 ch=in.readLine();
                }
            while(ch.equalsIgnoreCase("y"));           
            break;
            case 10:
            do
            {
                odd obn=new odd();
                obn.odd();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));            
            break;
            case 11:
            do
            {
                 perfect oby=new perfect();
                 oby.perfect();
                 System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                 ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));          
            break;
            case 12:
            do
            {
                smallest_greatest obi=new smallest_greatest();
                obi.smallest_greatest();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));                        
            case 13:
            do
            {
                sum_no obp=new sum_no();
                obp.sum_no();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));                        
            break;
            case 14:
            do
            {
                mixed obo=new mixed();
                obo.mixed();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));            
            break;
            case 15:
            do
            {
                twisted_prime obq=new twisted_prime();
                obq.twisted_prime();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));                        
            break;
            case 16:
            do
            {
                  typical obu=new typical();
                  obu.typical();
                  System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                  ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));          
            break;
            case 17:
            do
            {
                sum_product ob6=new sum_product();
                ob6.sum_product();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));            
            break;
            case 18:
            do
            {
                special obw=new special();
                obw.special();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));           
            break;           
            case 19:
            do
            {
                buzz oba=new buzz();
                oba.buzz();
                System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));                   
            break;
            case 20:
            do
            {
                    composite obj=new composite();
                    obj.composite();
                    System.out.println("Do you want to continue.....'Y' for Yes, 'N' for No");
                    ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));
            break;
            default:
            System.out.println("Wrong choice");
             } 
                System.out.println("Do you want to goto the main menu....'Y' for Yes, 'N' for No");
                ch=in.readLine();
            }
            while(ch.equalsIgnoreCase("y"));
       }       
    }

 
