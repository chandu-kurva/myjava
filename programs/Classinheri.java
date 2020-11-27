import java.util.Scanner;
class Bank
{
  String accname;
  int accno;
  public void details()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter accname:");
    String accname= s.nextLine();
    System.out.println("enter ac/no: ");
    int accno=s.nextInt();
    System.out.println("ACCname: " +accname);
    System.out.println("accnumber: " +accno);

  }
}
class Deposit extends Bank
{
  double amount;
  public void depositamt()
  {
  Scanner s=new Scanner(System.in);
    System.out.println("enter amount:");
    double amount=s.nextDouble();
    System.out.println("amount: " +amount);
  }
}
public class Classinheri
{
  public static void main(String args[])
  {
    Deposit d1=new Deposit();
    d1.details();
    d1.depositamt();
  }
}
