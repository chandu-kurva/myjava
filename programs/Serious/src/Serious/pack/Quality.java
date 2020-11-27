package Serious.pack;

public class Quality {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		String a="we work to live we live to be happy";
		String s="live";
		String b[]=a.split(" ");
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			if(s.equals(b[i]))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
