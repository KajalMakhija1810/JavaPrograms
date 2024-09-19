package Day2;
//WAJP to read 3 integer and print the min of 3 nos

public class P5 
{
	public static void main(String args[])
	{
		
		double n1 = Double.parseDouble(args[0]);
		double n2 = Double.parseDouble(args[1]);
		double n3 = Double.parseDouble(args[2]);
		
		
		double  res= n1 < n2 ? n1: n2;
		res = n3 > res ? n3:  res;
		
		System.out.println("min of 3 no = " + res);
		
		
	}
		
		
		
		
}

