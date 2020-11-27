public class EmpC
{
String ename;
int eid;
int esal;
String desg;
public EmpC(String ename1,int eid1,int esal1,String desg1);
{
  ename=ename1;
  eid=eid1;
  esal=esal1;
  desg=desg1;
}
public static void main(String[] args) {
  EmpC e=new EmpC("kumar",234,3400,"doctor");
  System.out.println(e.ename+ "\n" +e.eid);
}
}
