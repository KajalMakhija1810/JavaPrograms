package Day2;
//WAJP to read an integer nd find if it's even or odd
/*
 * Eg:- 18
 *
 */
public class P4 
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		
		String res= num % 2 == 0? "even" : "odd";
		System.out.println("res = " +res);
		
}

}
