import java.util.Scanner;
class Scanner1
{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("enter name:");
    String name=s.nextLine();
    System.out.print("enter age:");
    int age=s.nextInt();
    System.out.print("enter percentage:");
    float score=s.nextFloat();
    System.out.print("enter result status:");
    String result=s.next();
    System.out.print("enter Contact no:");
    long call=s.nextLong();
    System.out.print("enter gender:");
    char gender=s.next().charAt(0);
    System.out.println("the details you have entered");
    System.out.println("name:" +name);
    System.out.println("Age" +age);
    System.out.println("Score:" +score);
    System.out.println("Result:" +result);
    System.out.println("Phone no:" +call);
    System.out.println("Gender:" +gender);


  }
}
