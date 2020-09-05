import java.util.Scanner;
class IfCondition
{
public static void main(String Args[])
{
Scanner in =new Scanner(System.in);
System.out.println("Enter Your Age:");
int age = in.nextInt(); 
if(age>18)
{
	System.out.println("You are eligible for voting");
}	
}
}