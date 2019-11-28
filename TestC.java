interface Sample
{
	public demo get(String s);
}

class demo
{
	demo(String name)
	{
	  System.out.println("Demo Constructor"+name);
	}
}

class TestC
{
	public static void main(String[] agrs)
	{
	  Sample s= demo::new;

	  demo d=s.get("Hello");
	}
}