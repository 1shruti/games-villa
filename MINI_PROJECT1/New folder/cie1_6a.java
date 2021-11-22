
public class cie1_6a {
	void type1() 
	{
	for(int i=1;i<=3;i++)
	  {
		for(int j=1;j<=i;j++)
		{
			System.out.print(1 +" ");
		}
		System.out.println("");
	  }
	}
	void type2() 
	{
	for(int i=1;i<=3;i++)
	  {
		for(int j=i;j<=3;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(k+" ");
	  }
		System.out.println();
	  }
	}
	
	public static void main(String[] args) {
		cie1_6a obj=new cie1_6a();
		obj.type1();
		obj.type2();

	}

}
