class Pat26
{
  public static void main(String args[])
  {
    char ch='A';
    for(int i=1;i<=4;i++)
    {
      for(int j=1;j<=4;j++)
      {
        if(i>=j)
        {
          System.out.print("*");

        }
        else
        {
          System.out.print(ch);
          ch++;
        }
      }

      System.out.println();
    }
  }
}
