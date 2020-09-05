import java.util.Scanner;
class NestedIf
{
public static void main(String args[])
{
Scanner in =new Scanner (System.in);
System.out.println("Enter age");
int age=in.nextInt();
System.out.println("Enter Weight");
int weight=in.nextInt();
if(age>18)
{
if(weight>50)
{
System.out.println("Eligible for Blood Donation ");
}
else
{
	System.out.println("Not nEligible for Blood Donation ");
}
}
else
{
	System.out.println("Age must br greater than 18");
	
}
}
}