package Practice_prog;

public class Intercar {

	public static void main(String[] args) {
      audiprice a=new audiprice();
      a.carname();
      a.color();
      a.price();
	}

}
interface car
{
	void carname();
	void color();
	void price();
	
}
abstract class audi implements car
{
	public void carname()
	{
		System.out.println("Audi A6");
	}
	public void color()
	{
		System.out.println("Matte-black");
		
	}
	
}
class audiprice extends audi
{

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("12500000");
	}
	
}
