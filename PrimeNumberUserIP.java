import java.util.Scanner;
class PrimeNumberUserIP {
public static void main (String [] args) {


Scanner sc = new Scanner(System.in);
System.out.println(" Enter The Number ");
int a= sc.nextInt();

int count=0;

for (int i=1; i<=a; i++) 
{
if (a%i==0) 
   {
		count++;
     }}
 if(count==2){
		System.out.println("the number you entered is a prime numnber");
	      }
 else{
	System.out.println("The number is not a prime number");
	}
}
}