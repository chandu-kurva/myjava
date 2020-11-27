class Zomato
{
  public void getdish()
  {
    System.out.println("based on price");
  }
}
class User extends Zomato
{
  public void getdish()
  {
    System.out.println("based on rating");
  }
  public void placeorder()
  {
    System.out.println("order placed");
  }
}
public class Assignoverride1
{
  public static void main(String[] args) {
    Zomato z=new Zomato();
    z.getdish();
    User u=new User();
    u.getdish();
    u.placeorder();
    }
}
