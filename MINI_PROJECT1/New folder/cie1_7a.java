
public class cie1_7a {
	int a;
	cie1_7a(int a)
	{
		this.a=a;
	}
	static void swapvalue(int x1,int x2)
	{
		//call by value
		int temp;
		temp=x1;
		x1=x2;
		x2=temp;
	System.out.println("\nx1="+x1+"\tx2="+x2);
	}
	void swapref(cie1_7a a, cie1_7a b)
	{
		//call by reference
		cie1_7a c = new cie1_7a(a.a);
		a.a=b.a;
		b.a=c.a;
				System.out.println(a.a+"\t"+b.a);
		
	}
	
       public static void main(String[] args) {
    	   int n1,n2;
   			n1=5;
   			n2=3;
   		
    	   cie1_7a obj= new cie1_7a(30);
    	   cie1_7a obj1=new cie1_7a(45);
		System.out.println("\nbefore swap n1="+n1+"\tn2="+n2);
		obj.swapvalue(n1,n2);
		System.out.println("\nafter swap n1="+n1+"\tn2="+n2);
		
		
       }

}

