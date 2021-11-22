import java.util.Scanner;

public class cie1_6b {
	int factrec(int n)
	{
		if (n>0)
		{
			return (n*factrec(n-1));			
		}
		else
		{
			return 1;
		}
	}
	public static void main(String[] args) {
		cie1_6b obj= new cie1_6b();
		int n,f;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter any value:");
		 n=sc.nextInt();
		 f=obj.factrec(n);
		 System.out.println(f);
	}

}
