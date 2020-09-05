//This program deals with the usage of methods in java
import java.util.Scanner;
class Addition
{
public static void main(String args[])
{
Scanner in= new Scanner(System.in);
System.out.print("Enter a:");
int a=in.nextInt();
System.out.print("Enter b:");
int b=in.nextInt();
int c=add(a,b);
System.out.println("Addition Result:"+c); //calling the method
}
public static int add(int a1,int b1) //a1 and b1 are formal parameters
{
int c=a1+b1;
return c;  //returning the value
}
}

