class Test3
{
	public static void main(String[] agrs)
	{
	      String s1=new String("durga");
        String s2=new String("durga");
        
        StringBuffer sb1=new StringBuffer("durga");
        StringBuffer sb2=new StringBuffer("durga");
	
        System.out.println(sb1==sb2);
         System.out.println(sb1.equals(sb2));
	}
}
