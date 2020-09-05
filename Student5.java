//parametarized constructor
 class Student5
 {
 int id;
 String name;
  Student5(int i,String n)
  {
  id=i;
  name=n;
  }
  void display()
  {
  System.out.println("Student id:"+id);
  System.out.println("Student name:"+name);
  }
  public static void main(String args[])
  {
  Student5 s1=new Student5(510,"Manoj");
  Student5 s2=new Student5(520,"Sai");
  s1.display();
  s2.display();
  }
  }
  