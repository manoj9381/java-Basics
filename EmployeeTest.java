class Employee
{
int id;
String name;
float sal;
void insert(int i,String n,float s)
{
id=i;
name=n;
sal=s;
}
void display()
{
System.out.println(id+" "+name+" "+sal);
}
}
class EmployeeTest
{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insert(510,"Manoj",40000);
e2.insert(520,"Madhu",40000);
e3.insert(530,"Sai",40000);
e1.display();
e2.display();
e3.display();
}
}


