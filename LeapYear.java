import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
System.out.println("Enter year");
int year=in.nextInt();
if(year%4==0)
{
System.out.println("The given year is leap year");
}
else if(year%100==0)
{
System.out.println("The given year is not leap year");
}
else if(year%400==0)
{
System.out.println("The given year is leap year");
}
else
{
System.out.println("The given year is not leap year");
}
}
}


