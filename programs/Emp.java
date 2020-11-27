public class Emp
{
String ename;
int eid;
int esal;
String desg;
public Emp(String name,int id,int sal,String desg1)
{
  ename=name;
  eid=id;
  esal=sal;
  desg=desg1;
}
public void display()
{

  System.out.println("name : " +ename);
  System.out.println("designation : " +desg);
  System.out.println("salary " +esal);
  System.out.println("id : " +eid);
}
public static void main(String[] args) {
  Emp e=new Emp("kumar",234,3400,"doctor");
  e.display();
}
}
