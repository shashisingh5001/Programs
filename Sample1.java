interface Test1
{
	public void show(int a, int b);
}

/*class Demo implements Test1
{
	public void show(int a,int b)
	{
		System.out.println("ADD="+(a+b));
	}
}*/

class Sample1
{
	public static void main(String[] agrs)
	{
	  Test1 d=()->{(int a,int b)(a+b)};

	  d.show(10,20);
	

	 
	}
}