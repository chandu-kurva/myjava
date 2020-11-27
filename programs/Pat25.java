class Pat25
{
  public static void main(String args[])
  {
    int k=4;
    for(int i=4;i>=1;i--)
    {
      for(int j=1;j<=4;j++)
      {
        if(i>=j)
        {
          System.out.print(k);

        }
        else
        {
          System.out.print(" ");
        }
      }
      k--;
      System.out.println();
    }
  }
}
