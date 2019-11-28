

class AAC
{
	public static void main(String[]agrs)
	{
		int[] a={5,4,7,8,6,3,9,2,1};

		int n=a.length;

		int temp=0;

		for(int i=0; i<a.length;i++)
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

		for(int i=0;i<n-1;i++)
		{
			System.out.println(a[i]+",");
		}
		System.out.println(a[n-1]);
                                   System.out.println("HEllo");
	}
}