import java.util.*;


/*class Demo implements Runnable
{
	public void run()
	{
	  for(int i=0; i<=10;i++)
	  {
	    System.out.println("Demo Thread");
	  }
	}
}*/

class TestR
{
        public static void show()
	    {
	        for(int i=0; i<=10;i++)
	       {
	          System.out.println("Demo Thread");
	       }
	    }

	public static void main(String[] agrs)
	{
      
	  
	  Runnable r=TestR::show;

	    Thread t=new Thread(r);

	    t.start();

	    for(int i=0;i<=10;i++)
	    {
	       System.out.println("Thread-1");
	    }
	}
}