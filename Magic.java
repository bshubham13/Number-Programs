//Its a Magic Number the Number which gives sum exactly 1.
import java.util.Scanner;
class Magic
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Magic number");
        int m=sc.nextInt();
        int n=m;
        int rem=1;
        while(n>9)
        {
             int s=0;
             while(n>0)
            {
                rem=n%10;
                s=s+rem;
                n=n/10;
            }
             n=s;
        }
            if(n==1)
            {
                 System.out.println("it is a magic number");
            }
            else
            {
                System.out.println("it is not a magic number");
            }
    }
}