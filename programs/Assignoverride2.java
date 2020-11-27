class Shape
{
  public void getarea()
  {
    System.out.println("area of shapes:");
  }
  public void color()
  {
    System.out.println("blue");
  }
}
class Circle extends Shape
{
  float r=3.0f;
public void getarea()
{
  float f=3.14f*r*r;
  System.out.println("area of circle:" +f);
}
}
class Square extends Shape
{
  int s=5;
  public void getarea()
  {
    int f=s*s;
    System.out.println("area of square:" +f);
  }
  public void color()
  {
    System.out.println("black");
  }

}
public class Assignoverride2
{
  public static void main(String[] args)
  {
    Shape s=new Shape();
    s.getarea();
    s.color();
    Circle c=new Circle();
    c.getarea();
    Square s1=new Square();
    s1.getarea();
    s1.color();
  }
}
