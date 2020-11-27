package Practice_prog;

public class Javabean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       business b=new business();
       b.setbname("java");
       System.out.println(b.getBname());
       b.setBprice(250);
       System.out.println(b.getBprice());
       b.setBauthor("james gosling");
       System.out.println(b.getBauthor());
       b.setPublisher("Chandu");
       System.out.println(b.getPublisher());
       
	}

}
class business
{
	private String bname;
	private int bprice;
	private String bauthor;
	private String publisher;
	
	public String getBname() 
	{
		return bname;
	}
	public void setbname(String bname) 
	{
		this.bname = bname;
	}
	public int getBprice() 
	{
		return bprice;
	}
	public void setBprice(int bprice) 
	{
		this.bprice = bprice;
	}
	public String getBauthor() 
	{
		return bauthor;
	}
	public void setBauthor(String bauthor) 
	{
		this.bauthor = bauthor;
	}
	public String getPublisher() 
	{
		return publisher;
	}
	public void setPublisher(String publisher) 
	{
		this.publisher = publisher;
	}
	
}