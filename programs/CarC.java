public class Car
{
  String ccolor,cname,cmodel;
  int cprice;
  String ccapacity;
  public Car(String name,String color)
  {
  cname=name;
  ccolor=color;

  }
  public Car(String name,String color,int price)
  {
    cname=name;
    ccolor=color;
    cprice=price;

  }
  public Car(String name,String color,String model,int price,String capacity)
  {
    cname=name;
    ccolor=color;
    cmodel=model;
    cprice=price;
    ccapacity=capacity;
  }
  public static void main(String[] args) {
    Car c=new Car("Merc","black");
    System.out.println(c.cname+","+c.ccolor);
    Car c1=new Car("audi","white",1000000)
    System.out.println(c1.cname+ +c1.ccolor+ +c1.cprice);
    Car c2.new Car("austin","ash","b-22",2000000,"2.2l");
    System.out.println(c2.cname+ +c2.ccolor+ +c2.cmodel+ +c2.cprice+ +c2.ccapacity);
  }
}
