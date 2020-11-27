package Practice_prog;

public class SecondHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,23,44,55,66};
int temp;
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length-1;j++)
	{
		if(a[j]<a[j+1])
		{
			temp=a[j+1];
			a[j+1]=a[j];
			a[j]=temp;
			}
	}
}
System.out.println(a[1]);

}
}