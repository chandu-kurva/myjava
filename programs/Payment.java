public class Payment
{
  public static void payment(String wallettype,int uid)
  {
   System.out.println("wallettype: " +wallettype+ "\n" + "uid :" +uid);
  }
  public static void payment(String cardtype,long cardno,int cvvnumber)
  {
      System.out.println(cardtype+ " " +cardno+ " " +cvvnumber);
  }
  public static void payment(String type,String username,int pwd,long Accountno)
  {
      System.out.println(type+ " " +username+ " " +pwd+ " " +Accountno);
  }
  public static void main(String args[])
  {
    payment("googlepay",1221);
    payment("debit",123456789l,322);
    payment("netbank","john",1290,123456789l);
    }
}
