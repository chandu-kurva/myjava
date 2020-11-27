package Java_programs.com;

public class Qspiders {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("with out casting:");
		Student s=new Student();
		s.View();
		Admin a=new Admin();
		a.View();
		a.Edit();
		System.out.println("with upcasting we hide sub class props:");
		Student s1=new Admin();//upcating here it will hide the subclass features but can access the overridding method of subclass. 
		s1.View();
		System.out.println("after down-casting results are:");
		//s1.Edit();//CTE as superclass ref var cannot access the subclass member i.e, we cannot call subclass member using super class ref variable
		Admin a1=(Admin)s1;//Admin a1=new Admin();//downcasting and this is explicitly called cause super class object doesnot contain subclass properties
		a1.View();
		a1.Edit();
	}

}
class Student
{
	public void View()
	{
		System.out.println("as im a student i will just view");
	}
}
class Admin extends Student
{
	public void View()
	{
		System.out.println("as im an admin, I have privelage to view");
	}
	public void Edit()
	{
		System.out.println("only admin can edit no other");
	}
}