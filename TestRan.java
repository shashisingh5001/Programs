import java.util.*;
import java.util.function.*;

class TestRan
{
   public static void main(String[] agrs)
   {
   	   Supplier<Double> s=()->Math.random()*10;

   	   System.out.println(s.get());
   }	
}