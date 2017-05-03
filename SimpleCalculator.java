package calculator;

import java.util.Scanner;

public class SimpleCalculator {
	

public static void main(String[] args) 
{
	
	Scanner scan = new Scanner(System.in);
	System.out.println("press 0 to continue with calculator, 1 to exit");
	int y=scan.nextInt();
	int i;
	for(i=y;i<1;i++)
	{

System.out.println("enter two values");
int a=scan.nextInt();
int b=scan.nextInt();
int sub=a-b;
int add=a+b;
int mul=a*b;
int div=a/b;
System.out.println("choose the operation 1.addition 2.subraction 3.multiplication 4.divition");

int op=scan.nextInt();
if(op>0 && op<5)
{
if(op==1)
{
		System.out.println("addition value is "+add);
}
if(op==2)
{
		System.out.println("subraction value is "+sub);
}
if(op==3)
{
		System.out.println("multiplied value is "+mul);
}
if(op==4)
{
		System.out.println("subraction value is "+div);
}}
else
{
	System.out.println("enter values between 1 to 4");
	
}
System.out.println("if you want to continue calculator press 1,else 0");
int v=scan.nextInt();
i=y-v;
}
	System.out.println("Thank you for using sathish's program :)");
	scan.close();
}
}