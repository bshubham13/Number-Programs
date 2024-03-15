class PrimeNumber {
public static void main (String [] args) {

int a=5;
int count=0;

for (int i=2; i<a; i++)   // 2 to 8 where i=iteration , it will update 6 times
{
if (a%i==0) 
   {
    count++;
    break;
   } 
}

if (count==0)
{
System.out.println(" It is Prime Number ");
}
else 
{
System.out.println(" It is Not Prime Number ");
}



}
}