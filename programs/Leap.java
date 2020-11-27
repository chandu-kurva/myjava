public class Leap
{
  public static void main(String[] args) {
    int y=2020;
    if(y%400==0)
    {
      System.out.println("is leap ");
    }
    else if(y%100==0)
    {
      System.out.println("not");
    }
    else if(y%4==0)
    {
      System.out.println("leap");
    }
    else{
      System.out.println("not");
    }
  }
}
