package Day2;
//WAJP to read radius from CLA and Find the area and Circum
public class P2 
{
	public static void main(String args[])
	{
		final double PI= 3.14159;
		double radius = Double.parseDouble(args[0]);
		
		double area = PI * radius * radius;
		double circum = 2* PI * radius;
		
		System.out.println("area =" + area);
		System.out.println("circum =" + circum);
		
		System.out.printf("area = %.2f%n" ,area);
		System.out.printf("Circum = %.2f%n" , circum);
		
		System.out.format("area = %.2f%n" ,area);
		System.out.format("Circum = %.2f%n" , circum);
		
		
		
		
		
		
		
		
		
	}

}
