package Day2;
//WAJP to 3 integer and print the min of two nos

public class P6 
{
	public static void main(String args[])
	{
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		int res= n1 < n2 ? n1: n2;
		
		System.out.println("min of 2 no = " + res);
		
		
	}
		
		
		
		
}

