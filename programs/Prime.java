public class Prime
{
  public static void main(String[] args) {

    int num=11;
    boolean status=true;
    for(int i=2;i<=(num-1);i++)
    {
      if(num%i==0)
      {
        status=false;
        break;
      }

    }
    if(status=true)
    {
      System.out.println("is prime");
    }
    else
    {
      System.out.println("not a prime");
    }
  }
}
