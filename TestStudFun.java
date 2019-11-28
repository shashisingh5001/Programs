import java.util.function.*;

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

class TestStudFun
{
    public static void main(String[]agrs)
    {


       Function<Student,String>f=s->
       {
       	   String grade=null;
       	   int marks=s.marks;

       	   if(marks>=70)
           {
       	   	grade="First class with distinction";
           }
       	   else if(marks>=60)
           {
       	   	grade="First class";
       	   }
       	   return grade;
       };

       Student[] s1={new Student("Edusol",75),new Student("Sol",65)};

        for(Student s2:s1)
        {
        	System.out.println("Name"+s2.sname);
            System.out.println("Name"+s2.marks); 
            System.out.println("Grade"+f.apply(s2));       	
        }

    }
	
}