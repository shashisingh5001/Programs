import java.io.*;

class Dupl2
{
	public static void main(String[]args)
	{
		      int[] a=new int[]{1,2,3,4,4};
          int[] b=new int[]{2,4,6,9,6};
          
          int sum=0;
         
           
		  System.out.println("Duplicate Element In Give Array");
          
         /* for(int i=0;i<a.length;i++)
          {
          	for( int j=0;j<a.length;j++)
          	{

          		if(a[i]==b[j])
          	     {
                   
                   System.out.println(a[i]);
                   c[k]=a[i];

                   sum=sum+c[k];
                    k++;
                   
                 }    

            }		

        }*/
         for(int i=0;i<a.length;i++)
          {
            for( int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
                 {

                   System.out.println(a[j]);
                 
                                    
                 }    

            }   

        }

       
	}
}
