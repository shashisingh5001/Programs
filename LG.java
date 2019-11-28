

class LG
{
	public static void main(String[]agrs)
	{
		int[] arr={23,4,5,6,34,5,5,6666,77,7,88,66,83};

		int max=0;

		for(int i=0; i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}