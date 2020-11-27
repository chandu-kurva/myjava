package Practice.orgs;

public class Countevn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count=0;
		for(i=1;i<=25;i++)
		{
			if(i%5==0)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
