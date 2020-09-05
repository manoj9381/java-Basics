import java.util.Scanner;
class Fibanocii
{
public static void main(String args[])
{
int n1=0,n2=1,n3,count;
Scanner in=new Scanner(System.in);
count=in.nextInt();
System.out.print(n1+" "+n2);
for(int i=3;i<=count;i++)
{
n3=n1+n2;
System.out.print(" "+n3);
n1=n2;
n2=n3;
}
}
}
