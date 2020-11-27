class Login
{
  public static void main(String args[])
  {
    System.out.println(login("Qspiders",1234));
  }
  public static boolean login(String user,int pwd)
  {
    if(user=="Qspiders" && pwd==1234)
    {
      //System.out.println("Login Successful");
      return true;
    }
    else
    {
      //System.out.println("login failed");
      return false;
    }
  }
}
