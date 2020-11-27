package Practice.orgs;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num=10,count=0;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count=count+1;
			}
			
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not a prime");
		}
		
		int j,a=0,b=1,c;
		System.out.print(a+" "+b);
		for(j=1;j<=9;j++)
		{
			c=a+b;
			System.out.print(" " +c+ " ");
			a=b;
			b=c;
			
		}

	}

}
