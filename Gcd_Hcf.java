package gcd_hcf;
import java.util.Scanner;
public class Gcd_Hcf
{
public static void main(String[] args)
{
int gcd = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter no1");
int no1 = sc.nextInt();
System.out.println("Enter no2");
int no2 = sc.nextInt();
int small = no1<no2?no1:no2;
	while(small>1)
		{
		if((no1%small==0)&&(no2%small==0))
			{
			gcd = small;
			break;
			}
		small--;
		}
			if(gcd==0)
			{
			System.out.println("No GCD");
			}
			else
			{
			System.out.println("GCD is "+gcd);
			} 
}
}