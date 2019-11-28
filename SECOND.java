import java.util.*;

class SECOND
{
	public static void main(String[] agrs)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter No of Element You Want");
		int n=sc.nextInt();

		int a[]=new int[n];

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
          int temp=0;
        
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			
				if(a[i]>a[j])
				{

					temp=a[i];
					a[i]=a[j];
					a[j]=temp;

					
					
				}
			}
		}
		            System.out.println("Largest Number in Array: "+a[n-1]);
					System.out.println("Smallest Number in Array: "+a[0]); 
		          
		          System.out.println(" Second Largest Number in Array:"+a[n-2]);
	}
}