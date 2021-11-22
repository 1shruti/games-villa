import java.util.*;
public class cie1_5b {

	public static void main(String[] args) {
		int array[]=new int[5];
	int	count=0,check;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter any array values");
       for(int i=0;i<5;i++)
       {
    	   array[i]=sc.nextInt();
       }
       System.out.println("The array elements are:");
       for(int i=0;i<5;i++)
       {
    	   System.out.println(array[i]);
       }
       System.out.println("enter element no to be  checked");
       check=sc.nextInt();
       for(int i=0;i<5;i++)
       {
    	   if(array[i]==check)
    	   {
    		   count++;
    	   }
       }
       System.out.println("no of occurences is "+count);

       
	}

}
