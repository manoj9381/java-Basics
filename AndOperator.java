class AndOperator
{
public static void main(String args[])
{
int a=10;
int b=5;
int c=2;
System.out.println(a<b&&a++>b); // false&&true-->false
System.out.println(a);  // a=10 second condition will not be checked.
System.out.println(a<b&a++>c); // Two conditions are checked.
System.out.println(a); //a=11
}
}