package Day2;
//WAJP to read two integers from CLA and swap their Values
/*
 * Example:-
 * 
 * n1 =10  n2 =20
 * o/p:- n1=20, n2=10
 */


public class P3 
{
	public static void main(String args[])
	{
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		System.out.println("n1=  " +n1 +"n2=  " + n2);
		
		int n3=n1;
		n1 =n2;
		n2=n3;
		
		System.out.println("n1=   "+ n1 +"n2=   "+ n2); 
		
		
		
		
		//Integer.parseInt(args[0]) Converts String into int
		
		
		
		
		
		
		
		
		
	}

}
