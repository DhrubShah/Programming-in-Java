package first;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Looping {
	public static void main(String args[])
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		int count=0;
		try {
			
		
		System.out.println("Enter The value of n");
		n=Integer.parseInt(in.readLine());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		for(int i=0;i<=n;i++)
		{
			if(i%n==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n+"Is Prime");
		}
		else {
			System.out.println(n+"Is not Prime");
		}
	
	}

}
