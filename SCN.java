import java.util.*;

class SCN
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter No of Element You Want");
		int n=sc.nextInt();

		int[] arr=new int[n];

		System.out.println("Enter Elements");

        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
	}
}