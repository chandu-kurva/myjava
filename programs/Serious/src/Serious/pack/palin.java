package Serious.pack;

public class palin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="abba";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			rev=rev+c;
		}
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("is a palindrome String");
		}
		else
		{
			System.out.println(rev);
			System.out.println("is not a palindrome");
		}
		System.out.println(s.hashCode());
		System.out.println(s.toString());
		System.out.println(s.substring(0,3));
		//on diff between equals and double equals operator
		String s1="java";
		String s2="java";
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		}
}
