import java.util.function.*;

class TestFun
{
	public static void main(String[]agrs)
	{
       Function<Integer,Integer> f=i->i*i;

	   System.out.println(f.apply(4));


	   //Function<String,Integer> f=i->i.length();
	   //System.out.println(f.apply("Hello"));
	  
	   
	   //Function<String,String> f=i->i.toUpperCase();
      //System.out.println(f.apply("Hello"));

	}
}