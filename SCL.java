import java.util.*;

class SCL
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

       int larg1,larg2,temp;

       larg1=arr[0];
       larg2=arr[1];

       if(larg1<larg2)
       {
       	 temp=larg1;
       	 larg1=larg2;
       	 larg2=temp;
       }

       for(int i=2; i<arr.length;i++)
       {
       	if(arr[i]>larg1)
       	{

           larg2=larg1;
           larg1=arr[i]; 
       	}
       	else if(arr[i]>larg2 && arr[i]!=larg1)
       	{
       		larg2=arr[i];
       	}
       }

       System.out.println(larg1);
       System.out.println(larg2);

	}
}