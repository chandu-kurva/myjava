class First
{
  static int i=100;
  String s="java";
}
class Second
{
  public static void main(String[] args) {
    System.out.println(First.i);
    First f=new First();
    System.out.println(f.s);
  }
}
