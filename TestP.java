import java.util.function.*;

class TestP
{
	public static void main(String[] agrs)
	{

		Predicate<Integer> p=i-> i%2==0;

		System.out.println(p.test(10));
	}
}