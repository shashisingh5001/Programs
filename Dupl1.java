import java.io.*;

class Dupl1
{
	public static void main(String[]args)
	{
		      int[] a=new int[]{1,2,3,4,5,5};
          int[] b=new int[]{2,4,6,9,6,2};
          int[] c=new int[20];
          int[] d=new int[20];
          int sum=0;
          int k=0;
          int m=0;
           
		  System.out.println("Duplicate Element In Give Array");
         
     
        for(int i=0;i<a.length;i++)
          {
            for( int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
                 {
                    c[k]=a[i];
                    System.out.println("1st Array Duplicate:"+a[i]);
                                                       
                 }    

            }   

        }

          for(int i=0;i<a.length;i++)
          {
            for( int j=i+1;j<a.length;j++)
            {
              if(b[i]==b[j])
                 {
                    d[m]=b[i];
                    System.out.println("2nd Array Duplicate:"+b[i]);
                                                       
                 }    

            }   

        }

       
          
         
      

     
	}
}
