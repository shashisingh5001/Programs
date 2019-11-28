import java.util.function.*;

class TestFun2
{
	  public static void main(String[] agrs)
	  {
        DoubleToIntFunction f=i->i*i;

        System.out.println(f.applyAsInt(15.8));
	  	//DoubleFunction<Double>f=i->i*i;

        //System.out.println(f.apply(52.34));
        //IntFunction<Integer>f=i->i*i;

        //System.out.println(f.apply(5));
        //BiFunction<Integer,Integer,Integer>f=(a,b)->a+b;

        //System.out.println(f.apply(10,20));
	  }
}