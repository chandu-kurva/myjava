import java.util.Scanner;
class accountholder
{
  String ahname,branch,acctype;
  long accnum,ifsc;
public  int bal;
  public void accholder(String ahname,long accnum,String branch,long ifsc,int bal,String acctype)
  {
    System.out.println("ACCOUNT HOLDER DETAILS:");
    System.out.println("ACCOUNT HOLDER: " +ahname);
    System.out.println("ACCOUNT NUMBER: " +accnum);
    System.out.println("BRANCH: " +branch);
    System.out.println("IFSC CODE: " +ifsc);
    System.out.println("BALANCE: " +bal);
System.out.println("TYPE OF ACCOUNT: " +acctype);
  }
  static int currentbalance;
  public void deposit()
  {
    Scanner s=new Scanner(System.in);
    accountholder a2=new accountholder();

    System.out.println("current balance: " +a2.bal);
    System.out.println("enter amount to deposit money:");
    int depositmoney=s.nextInt();
                a2.bal=bal+depositmoney;
                currentbalance=a2.bal;
                System.out.println("balance after depositing: "+currentbalance);
              }
              public void withdrawl()
              {
                Scanner w=new Scanner(System.in);
                accountholder a3=new accountholder();
                int curr=a3.currentbalance;
                System.out.println("balance after depositing" +curr);
                System.out.println("enter the amount for withdraw");
                int draw=w.nextInt();
                if(draw<curr)
                {
                  System.out.println("ERROR");
                }
                else
                {
                  int presentbal;
                  presentbal=curr-draw;
                  System.out.println("balance after withdrawl" +presentbal);

                }
              }
  public void pin()
  {
    Scanner p=new Scanner(System.in);
    System.out.println("enter old pin");
    int oldpin=p.nextInt();
    System.out.println("enter new pin");
    int newpin=p.nextInt();
    System.out.println("re-enter new pin");
    int rnewpin=p.nextInt();
    if(newpin==rnewpin)
    {
      System.out.println("pin is" +rnewpin);
    }
    else
    {
      System.out.println("error");
    }
  }
}
public class Bankapp
  {
    public static void main(String args[]) {
      accountholder a1=new accountholder();
      a1.accholder("Chandu",1234567,"hyd",1234,23000,"saving");
      Scanner obj=new Scanner(System.in);
      System.out.println("choose options");
      System.out.println("1.deposits 2.withdrawl 3.changepin");
      int option=obj.nextInt();
      if(option==1)
      {
        System.out.println("welcome to deposit");
        a1.deposit();
      }
      else if(option==2)
      {
        a1.withdrawl();
      }
      else
      {
        a1.pin();
      }
    }
  }
