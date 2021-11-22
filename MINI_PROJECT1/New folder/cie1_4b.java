//class cie1q
//{
//	
//}
public class cie1_4b {
	int x,y,compute;
	double result;
	 int  sum()
	{
		x=5;
		y=10;
		compute=x+y;
		return compute;
		
	}
	 int diff()
	 {
		 x=10;
		 y=5;
		 compute=x-y;
		 return compute;
	 }
	 int product()
	 {
		 x=3;
		 y=5;
		 compute=x*y;
		 return compute;
	 }
	 double div()
	 {
		 x=6;
		 y=5;
		 result=x/y;
		 return result;
		 
	 }
	 double mod()
	 {
		 x=9;
		 y=5;
		 result=x%y;
		 return result;
	 }
	public static void main(String[] args) {
		cie1_4b q4=new cie1_4b();
		int a,b,c;
		double d,e;
		a=q4.sum();
		System.out.println(a);
		b=q4.diff();
		System.out.println(b);
		c=q4.product();
		System.out.println(c);
		d=q4.div();
		System.out.println(d);
		e=q4.mod();
		System.out.println(e);
		
		
	}

}
