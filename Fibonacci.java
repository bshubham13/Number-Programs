//Its a Fibonacci Sequence Program. A series of numbers in which each number is the sum of the two preceding numbers.


import java.util.Scanner;
class Fibonacci
{
    public static void main(String[]args)
    {
         Scanner sc=new Scanner(System.in);
         int e=0;
         int b=1;
         System.out.println("Enter your number");
         int n=sc.nextInt();
         System.out.println(e);
         for(int i=1;i<=n;++i)
         {
             int d=e+b;
             e=b;
             b=d;
             System.out.println(e);
         }
    }
}