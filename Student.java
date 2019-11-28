import java.util.*;
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

class Test
{
	public static void main(String[] agrs)
	{
	   ArrayList<Student> a1=new ArrayList<Student>();

	   a1.add(new Student("Shashi",10));
	   a1.add(new Student("Ashih",20));
	   a1.add(new Student("Umesh",25));
	   a1.add(new Student("Navnath",30));

	   for(Student a2:a1)
	   {

	     System.out.println(a2.name);
	     System.out.println(a2.rollno);
	   }
	}
}