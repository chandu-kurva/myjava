public class MethodOver
{
  public static void add()
  {
    System.out.println("default add methods");
  }
  public static void add(int i)
  {
    System.out.println(i+100);
  }
  public static void add(char ch,int i)
  {
    System.out.println(ch+i);
  }
  public static void add(int i,char ch)
  {
    System.out.println(i+ch);
  }
  public static void main(String args[])
  {
    add();
    add(100);
    add('A',100);
    add(200,'z');
  }
}
