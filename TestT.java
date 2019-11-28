/*class Demo implements Runnable
{
	
	public void run()
	{
       
        for(int i=0;i<=10;i++)
        {
           System.out.println("Demo Thead-1");
        }

	}
}*/

class TestT
{
	public static void main(String[] agrs)
	{
	
	Runnable r=()->{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread-1");
		}
	};
	  Thread t=new Thread(r);

	  t.start();

	  for(int i=0; i<=10;i++)
	  {
	    System.out.println("Main Thread-2");
	  }
	}
}