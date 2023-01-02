
public class StringLearning {

	public static void main(String[] args) 
	{
		String j = "Rahul Shetty Academy";
		for (int i= 0; i<j.length(); i++)
		{
			System.out.println(j.charAt(i));
		}
		
		for (int i=j.length()-1;i>=0;i--)
		{
			System.out.println(j.charAt(i));
		}
		
		StringLearning g = new StringLearning();
		String b = g.getData();
		System.out.println(b);
	}
	
	public String getData()
	{
		System.out.println("Rutuja");
		return "Mel";
		
	}

}
