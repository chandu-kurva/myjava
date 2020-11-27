package Practice.orgs;
import java.util.*;

public class Swithc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("enter integer");
		i=sc.nextInt();
		switch(i)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:System.out.println("weekday");
		break;
		case 6:System.out.println("weekend-1");
		break;
		case 7:System.out.println("weekend-2");
		break;
	default:System.out.println("invalid");
	break;
		
		}
		
	}

}
