package Practice_prog;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,50};
boolean status=true;


for(int i=1;i<=100;i++)
{
	for(int j=0;j<a.length;j++)
	{
		if(i==a[j])
		{
			status=false;
			break;
		}
	}
		if(status==true)
		{
			System.out.println(i);
		}
		status=true;
	
}
	}

}
