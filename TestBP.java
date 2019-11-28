import java.util.function.*;

class TestBP
{
	public static void main(String[] agrs)
	{

		BiPredicate<Integer,Integer> p=(i,j)-> (i+j)%2==0;

		System.out.println(p.test(10,15));
	}
}