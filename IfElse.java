import java.util.Scanner;
class IfElse
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
System.out.println("Enter number:");
int n=in.nextInt();
if(n%2==0)
{
System.out.println("The given number is even number");
}
else
{
System.out.println("The given number is odd number");
}
}
}