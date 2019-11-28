import java.util.*;
import java.util.function.*;
class Student
{
	String name;
	int rollno;

	Student(String name,int rollno)
	{

	    this.name=name;
        this.rollno=rollno;
	}
}

class TestStudent
{
	public static void main(String[] agrs)
	{
	   ArrayList<Student> a1=new ArrayList<Student>();

	   a1.add(new Student("Shashi",10));
	   a1.add(new Student("Ashih",20));
	   a1.add(new Student("Umesh",25));
	   a1.add(new Student("Navnath",30));

	   Predicate<Student>p1 =x->x.rollno>15;
	   Predicate<Student>p2 =x->x.rollno%2==0;

	   for(Student a2:a1)
	   {
          if(p1.negate().test(a2))
          {
	          System.out.println(a2.name);
	          System.out.println(a2.rollno);
	       }

	   }
	}
}