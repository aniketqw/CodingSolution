import java.util.*;
 
public class Main 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
 
    public static void solve(Scanner sc) 
    {
        String a=sc.nextLine();
        String ap="";
         String min=a.substring(2,5);
         String hours;
         int num;
         if(a.charAt(0)!='0')
         {
        hours=a.substring(0,2);
        num=Integer.parseInt(hours);
         }
         else
         {
         	hours=a.substring(1,2);
        num=Integer.parseInt(hours);
         }
        if(num<12 && num>=0)
        {
        	ap="AM";
        }
        else
        ap="PM";
        
        
        if(ap=="AM")
        {
            if(num==11 || num==12 || num==10)
            System.out.println(num+""+min+" "+ap);
            if(num<10 && num>0)
            System.out.println("0"+num+""+min+" "+ap);
            if(num==0)
            System.out.println("12"+min+" "+ap);
        }
        else
        {
        	int k;
        	if(num!=12)
            k=num-12;
            else
            k=num;
            if(k>9 && k<=12)
            System.out.println(k+""+min+" "+ap);
            else
            System.out.println("0"+k+""+min+" "+ap);
            

        }
    }
            
}        
    

