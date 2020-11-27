public class Carc
{
  String color,name,model;
  int price;
  String capacity;
  public Carc(String name,String color)
  {
  this.name=name;
  this.color=color;

  }
  public Carc(String name,String color,int price)
  {
    this.name=name;
    this.color=color;
    this.price=price;

  }
  public Carc(String name,String color,String model,int price,String capacity)
  {
    this.name=name;
    this.color=color;
    this.model=model;
    this.price=price;
    this.capacity=capacity;
  }
  public static void main(String[] args) {
    Carc c=new Carc("Merc","black");
    System.out.println(c.name+","+c.color);
    Carc c1=new Carc("audi","white",1000000);
    System.out.println(c1.name+ c1.color+ c1.price);
    Carc c2=new Carc("austin","ash","b-22",2000000,"2.2l");
    System.out.println(c2.name+ c2.color +c2.model +c2.price +c2.capacity);
  }
}
