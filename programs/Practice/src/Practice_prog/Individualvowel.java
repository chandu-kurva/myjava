package Practice_prog;

public class Individualvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javadevelopment";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			if(c=='a') 
			{
				count=count+1;
				System.out.println(count+ " " +c);
			}
		
			
		
			if(c=='e')
			{
				
				count=count+1;
				
				
			
			System.out.println(count+ " " +c);
			}
			if(c=='i')
			{
				
				count=count+1;
				
				
			
			System.out.println(count+ " " +c);
			}
			if(c=='o')
			{
				
				count=count+1;
				
				
			
			System.out.println(count+ " " +c);}
			if(c=='u')
			{
				
				count=count+1;
				
			
			
			System.out.println(count+ " " +c);
			}
			
		
		}
	}

}
