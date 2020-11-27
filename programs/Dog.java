public class EmpC
{
String ename;
int eid;
int esal;
String desg;
public EmpC(String ename,int eid,int esal,String desg);
{
  ename=ename;
  eid=eid;
  esal=esal;
  desg=desg;
}
public static void main(String[] args) {
  EmpC e=new EmpC("kumar",234,34000,"doctor");
  System.out.println(e.enmae+ "\n" +e.eid);
}
}
