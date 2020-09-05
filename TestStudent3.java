class Student
{
int rno;
String name;
}
class TestStudent3
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.id=510;
s1.name="Manoj";
s2.id=520;
s2.name="Sai";
System.out.println(s1.id+" "+s1.name);
System.out.println(s2.id+" "+s2.name);
}
}