import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
 
    public static void solve(Scanner sc) {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b){
            if(b<c)
            System.out.println("STAIR");
            else if(c<b)
            System.out.println("PEAK");
            else
            System.out.println("NONE");
        }
            else{
                System.out.println("NONE");}
            }        
    
}

