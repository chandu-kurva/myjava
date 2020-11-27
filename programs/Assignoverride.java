class Sbi
{
  public void rateofInterest()
  {
    System.out.println("7.7%");
  }

}
class Sbh extends Sbi
{
  public void rateofInterest()
  {
    System.out.println("8.5%");
  }
}
public class Assignoverride
{
  public static void main(String args[])
{
  Sbi i=new Sbi();
  Sbh h=new Sbh();
  i.rateofInterest();
  h.rateofInterest();
}
}
