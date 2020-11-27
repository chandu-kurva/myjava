public class Con2
{
  String bname;
  int bprice;
  public Con2()
  {
    bname="halfgirlfriend";
    bprice=334;
    }
    public static void main(String[] args) {
      Con2 c=new Con2();
      System.out.println(c.bname+ "\n" +c.bprice);
      Con2 c1=new Con2();
      System.out.println(c1.bname+ "\n" +c1.bprice);
    }
}
