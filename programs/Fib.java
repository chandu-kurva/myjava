public class Fib
{
  public static void main(String args[])
  {
    int a=0,b=1,fib;
    System.out.print(a+ " " +b+ " ");
    for(int i=0;i<=6;i++)
    {

      fib=a+b;
  System.out.print(fib+" ");
  a=b;
  b=fib;
    }
  }
}
