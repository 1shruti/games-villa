class student
{
	String name;
	int m1,m2,m3,avg;
	student()
	{
		name="shruti";
		m1=50;
		m2=60;
		m3=70;
	}
	student(int a,int b,int c)
	{
		name="bharati";
		m1=a;
		m2=b;
		m3=c;
	}
	student(String n)
	{
		name=n;
		m1=5;
		m2=1;
		m3=2;
	}
	student(int n)
	{
		name="sumant";
		m1=m2=m3=n;
		
	}
	void calculate()
	{
		avg=(m1+m2+m3)/3;
		System.out.println(avg);
	}
	void display()
	{
		System.out.println(name);
	}
}
public class cie13 {

	public static void main(String[] args) {
		student obj =new student();
         student obj2=new student(2,2,2);
         student obj3=new student(2);
         student obj4=new student("shruu");
         obj.display();
         obj.calculate();
         obj2.display();
         obj2.calculate();
         obj3.display();
         obj3.calculate();
         obj4.display();
         obj4.calculate();
        		 
	}

}
