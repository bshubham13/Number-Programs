import java.util.Scanner;
class SplitHalfNum {
public static void main(String [] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
int a = sc.nextInt();
int a1=a;
int count=0;

while (a1!=0)
{
count++;
a1=a1/10;
}

if (count%2==0)
{
int div=1;
for (int i=1; i<=count/2; i++)
{
     div=div*10;
}

int r=a%div;
int q=a/div;

System.out.println(r);
System.out.println(q);
}

else 
{
System.out.println("Do not Split the number");
}



}
}