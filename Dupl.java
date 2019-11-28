import java.io.*;

class Dupl
{
	public static void main(String[]args)
	{
		  int[] a=new int[]{1,2,3,4,2,7,8,8,3};
          int[] b=new int[]{2,4,6,5,3,7,0,9,0};
          int[] c=new int[10];
          int k=0;
		  System.out.println("Duplicate Element In Give Array");
          
          for(int i=0;i<a.length;i++)
          {
          	for( int j=0;j<a.length;j++)
          	{
          		if(a[i]==b[j])
          	     {
                   c[k]=a[i];
                 }    

            }		

        }

        for(int i=0;i<a.length;i++)
        {
        	System.out.println(c[i]);
        }

	}
}
