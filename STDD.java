import java.util.*;

class Student
{
	String sname;
	int marks;

	Student(String sname,int marks)
	{
		this.sname=sname;
		this.marks=marks;

	}
}

class STDD
{
   public static void main(String[] agrs)
   {

   ArrayList<Student> al=new ArrayList<Student>();
   al.add(new Student("Rohini",50));
   al.add(new Student("Umesh",55));
  al.add(new Student("Sasi",60));

  BiConsumer<Student,Integer>cc=(s,m)->s.marks=s.marks+m;

    for(Student s3:al)
    {
    	  cc.accept(s3,5);
    }
  for(Student s1:al)
  {
  	System.out.println(s1.sname);
  	System.out.println(s1.marks);

  }

  }
}