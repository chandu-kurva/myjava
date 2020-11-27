public class Employee
{
  static String ename="john";
  static int eid=3045;
  static String desg="developer";

  public static void display()
  {

    System.out.println(ename);
    System.out.println(eid);
    System.out.println(desg);
  }
  public static void main(String args[])
  {
    display();
    desg="QA";
    eid=3065;
    System.out.println(ename);
    System.out.println(eid);
  System.out.println(desg);
  }
}
