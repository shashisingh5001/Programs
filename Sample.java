interface Test1
{
	public void show();
}


class Sample
{
	public static void main(String[] agrs)
	{
	  Test1 t=()->{System.out.println("This Is Show Mwhtod");

        System.out.println("Hello");
	};

	  t.show();
	}
}