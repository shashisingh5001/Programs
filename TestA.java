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

class TestA
{
	public static void main(String[] agrs)
	{
	   Runnable r=new Runnable()
	   {
          public void run()
	{
	  for(int i=0; i<=10;i++)
	  {
	    System.out.println("Demo Thread");
	  }
	}
	   };

	    Thread t=new Thread(r);

	    t.start();

	    for(int i=0;i<=10;i++)
	    {
	       System.out.println("Thread-1");
	    }
	}
}