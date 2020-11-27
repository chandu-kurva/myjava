class Bank
{
  String Accname="chandu";
  int Accno=2345;
  public void details()
  {
  System.out.println("Acc name: " +Accname);
  System.out.println("Acc no: " +Accno);
  }
}
class Deposit extends Bank
{
  double amt=3443.44;
  public void depositamt()
  {
  System.out.println("deposite amt :" +amt);
}
}
class Withdrawl extends Deposit
{
  double withamt=4000;
  public void withdrawlamt()
  {
    if(withamt<amt)
    {
    System.out.println("withdrawl amount:" +withamt);
  }
  else
  {
    System.out.println("invalid amount");
    }
}
}
public class Custinher
{
  public static void main(String[] args) {
    Withdrawl e=new Withdrawl();
    e.details();
    e.depositamt();
    e.withdrawlamt();
  }
}
