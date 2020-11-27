class Pat29{
public static void main(String args[])
{
  int star=1,space=3;
  for(int i=1;i<=7;i++)
  {
    if(i<=3)
    {
    for(int j=1;j<=space;j++)
    {
      System.out.print(" ");
    }
    for(int k=1;k<=star;k++)
    {
      System.out.print("*");
    }
    star=star+2;
    space=space-1;
  }
  else
  {
    for(int l=1;l<=space;l++)
    {
      System.out.print(" ");
    }
    for(int m=1;m<=star;m++)
    {
      System.out.print("*");
    }
    star=star-2;
    space=space+1;
  }
     System.out.println();
   }
  }
}
//int star=1,space=3;
//for(int i=1;i<=7;i++)
//{
//  for(int j=1;j<=space;j++)
//  {
//    System.out.print(" ");
//  }
//  for(int k=1;k<=star;k++)
//  {
//    System.out.print("*");
//  }
//if(i<=3)
//{
//  star=star+2;
//  space=space-1;
//}
//else
//{
//  star=star-2;
//  space=space+1;
//}
