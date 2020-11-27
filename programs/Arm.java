public class Arm
{
  public static void main(String args[])
  {
    int num=153,rev=0,rem,temp=num;
    while(num>0)
    {
      rem=num%10;
      num=num/10;
      rev=rev+rem*rem*rem;
    }
    num=temp;
    if(rev==temp)
    {
      System.out.println(num+ " its armstrong no");
    }
    else
    {
     System.out.println(num+ " its not armstrong num");
    }
  }
}
