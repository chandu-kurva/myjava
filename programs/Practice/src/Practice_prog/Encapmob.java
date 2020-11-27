package Practice_prog;

public class Encapmob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buss b=new buss();
		b.setPowerpwd("saee1604");
		b.setEmailpwd("saee1604");
		b.setWhatsapppwd("saee1604");
		b.setGallerypwd("saee1604");
		System.out.println(b.getPowerpwd());
		System.out.println(b.getEmailpwd());
		System.out.println(b.getWhatsapppwd());
		System.out.println(b.getGallerypwd());

	}

}
class buss
{
	private String powerpwd;
	private String emailpwd;
	private String whatsapppwd;
	private String gallerypwd;
	public String getPowerpwd() {
		if(powerpwd=="saee1604")
		{
		return powerpwd;
		}
		else
		{
			return "invalid pwd";
		}
		}
	public void setPowerpwd(String powerpwd) {
		this.powerpwd = powerpwd;
	}
	public String getEmailpwd() 
	{
		if(emailpwd=="saee1604")
		{
		return emailpwd;
		}
		else
		{
			return "invalid pwd";
		}
		}
	public void setEmailpwd(String emailpwd) {
		this.emailpwd = emailpwd;
	}
	public String getWhatsapppwd() {
		if(whatsapppwd=="finger") {
		return whatsapppwd;
		}
		else
		{	
			return "invalid pwd";
		}
		}
	public void setWhatsapppwd(String whatsapppwd) {
		this.whatsapppwd = whatsapppwd;
	}
	public String getGallerypwd() {
		if(gallerypwd=="finger")
		{
			return gallerypwd;
		}
		else
			{
			return "invalid pwd";
			}
			}
	public void setGallerypwd(String gallerypwd) {
		this.gallerypwd = gallerypwd;
	}
}
