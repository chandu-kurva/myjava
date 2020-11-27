package Practice_prog;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javadevelopment";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
			{
				System.out.println("the vowels is"+ch);
			count=count+1;
			System.out.println("for no.of vowels" +count);
			}
		}
	
	}

}
