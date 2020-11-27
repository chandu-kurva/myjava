
package Practice_prog;
import java.util.*;
public class ArraySmall {

	private static Scanner s;

	public static void main(String[] args) {
     s = new Scanner(System.in);
      System.out.println("enter size of array:");
      int size;
      size=s.nextInt();
      int[] a=new int[size];
      int k=1;
      for(int i=0;i<a.length;i++)
      {
    	 
    	  System.out.println("enter data for " +k);
    	  k++;
    	  a[i]=s.nextInt();
      }
      System.out.println(a[0]);
      System.out.println(a[1]);
     int min=a[0];
     for(int i=0;i<a.length;i++)
     {
     if(a[i]<min)
    	 
    		 {
    	 min=a[i];
    	 }

    		 }
     System.out.println("the min value is "+min);

}
}
