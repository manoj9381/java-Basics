class OrOperator
{
public static void main(String args[])
{
int a=10;
int b=5;
int c=20;
System.out.println(a>b||b>c); // true||true=true
System.out.println(a>b|b>c);  // true||true=true
System.out.println(a<b||b++>c); //false||false=false
System.out.println(b);       // b=5 as only one condition is checked.
System.out.println(a<b|b++>c); //  false | false=false
System.out.println(b); // b=6 as two conditions are checked
}
}
