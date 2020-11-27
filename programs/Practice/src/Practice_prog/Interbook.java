package Practice_prog;

public class Interbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java j=new java();
		j.bookname();
		j.author();
		j.doborrowing();
		sql s=new sql();
		s.author();
		s.bookname();
		s.doborrowing();
		apti a=new apti();
		a.author();
		a.bookname();
		a.doborrowing();
	}

}
interface book
{
	void bookname();
	void author();
	void doborrowing();
}
class java implements book
{
	public void bookname() {
		// TODO Auto-generated method stub
		System.out.println("this is the first edition");
		
	}
	@Override
	public void author() {
		// TODO Auto-generated method stub
		System.out.println("Author name : James gosling");
		
	}
	@Override
	public void doborrowing() {
		// TODO Auto-generated method stub
		System.out.println("12-3-2100");
		
	}
}
class sql implements book
{

	@Override
	public void bookname() {
		// TODO Auto-generated method stub
		System.out.println("Oracle sql");
		
	}

	@Override
	public void author() {
		// TODO Auto-generated method stub
		System.out.println("Author name : James Cameroon");
	}

	@Override
	public void doborrowing() {
		// TODO Auto-generated method stub
		System.out.println("12-4-1999");
	}
	
}
class apti implements book
{

	@Override
	public void bookname() {
		// TODO Auto-generated method stub
		System.out.println("Aptitude World");
		
	}

	@Override
	public void author() {
		// TODO Auto-generated method stub
		System.out.println("Author name : Sakunthala Devi");
		
	}

	@Override
	public void doborrowing() {
		// TODO Auto-generated method stub
		System.out.println("12-5-1998");
	}
	
}