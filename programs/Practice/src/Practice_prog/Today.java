package Practice_prog;

public class Today {
	public static void main(String args[])
	{
		String s="eewweweee";
		int count=0;
		System.out.println(s.length());
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='e')
			{
				count=count+1;
			}
	}
		System.out.println(count);
	}
}
