package Practice_prog;

public class Strpalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="im java developer gfdbv fdbxf sdvsd";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
			{
				count=count+1;
		
			}
		}
		System.out.println(count+1);
		Mental();

	}
	
	public static void Mental()
	{
		String s1="java    developer";
		int count=1;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}

	

