class Bank
{
  String Accname="chandu";
  int Accno=2345;
  double avabal=100;
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
  avabal=avabal+amt;
  System.out.println("total ava bal is:" +avabal);
}
}
class Withdrawl extends Bank
{
  double withamt=1000;
  public void withdrawlamt()
  {
    if(withamt<avabal)
    {
    System.out.println("collect amount");
  }
  else
  {
    System.out.println("invalid amount");
    }
}
}
public class Hierarinher
{
  public static void main(String args[])
  {
    Deposit d=new Deposit();
    d.details();
    d.depositamt();
    Withdrawl w=new Withdrawl();
    w.details();
    w.withdrawlamt();
  }
}
