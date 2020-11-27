public class Area
{
  public static float areaofTri( int l,int b)
  {
    float f=0.5f*l*b;
    System.out.println("area of triangle : " +f);
    return f;
  }
  public static float areaofCircle(int r)
  {
    float f=3.14f*r;
    System.out.println("area of circle : " +f);
    return f;
  }
  public static int areaofRect(int l,int b)
  {
    int f=l*b;
    System.out.println("area of rectangle : " +f);
    return f;
  }
  public static int areaofSq(int s)
  {
    int f=s*s;
    System.out.println("area of square : " +f);
    return f;
  }
  public static void main(String args[])
  {
    areaofTri(4,3);
    areaofCircle(5);
    areaofRect(3,3);
    areaofSq(3);

  }
}
