//default Constructor

class DefaultConstructor
{
int rno;
String name;
void display()
{
System.out.println("name:" +name+" and rollno:"+rno);
}
public static void main(String args[])
{
DefaultConstructor d1=new DefaultConstructor();
DefaultConstructor d2=new DefaultConstructor();
d1.display();
d2.display();
}
}
//We cannot create any constructor here so by default default constructor is created.