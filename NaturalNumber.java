//Write a Program of Natural Number

import java.util.Scanner;
public class NaturalNumber {
	int sum=0;
       public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your Number");
		int a=sc.nextInt();
		NaturalNumber naturalNumber=new NaturalNumber();
		System.out.println(naturalNumber.sum1(a));
       }
		public int sum1(int n)
		{
			sum=sum+n;
			if(n>0)
			{
				n--;
				sum1(n);
			}
			return sum;
		}
	
}