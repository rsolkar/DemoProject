import java.util.ArrayList;

public class corejavabasics {

	public static void main(String[] args) 
	{
		int a=5;
		String b ="Rahul Shetty Academy";
		char ch ='r';
		double d =9.88;
		boolean bs = true;
		
		System.out.println(b + " This is the website");
		
		//Arrays
		
		int[] arr = new int[5];
		arr[0]=2;
		arr[1]=3;
		
		int[] arr2= {1,2,3,4,5};
		System.out.println(arr2[2]);
		
		String[] name = {"a","b","c","d","e"};
		
		//Loops
		
		for (int i=0; i<arr2.length;i++)
		{
			System.out.print(arr2[i]);
		}
		for (int i=0; i<arr2.length;i++)
		{
			System.out.print(" "+name[i]);
		}
		
		// Enhanced Loops and conditional statements
		
		for (String n:name)
		{
			System.out.println(n+" ");
		}
		
		//If array has a multiple of 2
		
		int[] num = {1,2,3,4,5,6,7,8};
		
		for (int i=0; i<num.length; i++)
		{
			if(num[i]%2 == 0) 
			{
				System.out.println(num[i]+"is a multiple of 2");
			}
			else 
			{
				System.out.println(num[i] +"is a not a multiple of 2");
			}
		}
		
		//ArrayList
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rutuja");
		list.add("Adnan");
		list.add("Shruti");
		list.add("Mel");
	
		System.out.println(list.get(2));
		
		//String Concept
		//2 ways to declare a string- Literal and new
		
		String x = "Rutuja";
		String y = "Rutuja";
		
		String z = new String("Rutuja");
		String p = new String ("Rutuja");
		
		String j = "Rahul Shetty Academy";
		String[] splittedstring= j.split(" ");
		System.out.println(splittedstring[0]);

	}

}
