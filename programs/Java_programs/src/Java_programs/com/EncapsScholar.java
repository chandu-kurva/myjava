package Java_programs.com;

public class EncapsScholar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Data d=new Data();
		d.setdata("16211A0263");
		System.out.println(d.gethall());
		d.setdob("17-04-1998");
		System.out.println(d.getdob());

	}

}
class Data
{
	private String hallticket;
	private String dob;
	public void setdata(String hallticket)
	{
		this.hallticket=hallticket;
	}
	public String gethall()
	{
		if(hallticket=="16211A0263")
		{
		     
			return hallticket;
		}
		else
		{
			return "invalid hallticket";
		}
	}
	public void setdob(String dob)
	{
		this.dob=dob;
	}
	public String getdob()
	{
		if(dob=="17-04-1998")
		{
			return dob;
		}
		else
		{
			return "invalid date of birth";
		}
	}
}
