import java.util.function.*;

class Test
{
	String ename;

	Test(String ename)
	{
		this.ename=ename;
	}
}

class ConsumerT
{
	public static void main(String[]agrs)
	{
		Consumer<ConsumerT>cc=e->System.out.println(e.ename.toUpperCase());
		Test e1=new Test("Edusole");

		cc.accept(e1);
	}
}