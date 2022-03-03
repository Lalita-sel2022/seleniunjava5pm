package com.adjeti;

public class ConstructorPractice
{
	static String cname="durgaSoft";
	int sno;
	String sname;
	
	ConstructorPractice(String sname, int sno)
	{
		this.sname=sname;
		this.sno= sno;
	}

	public static void main(String[] args)
	{
		System.out.println("Java practice for selenium");
		
		ConstructorPractice s1= new ConstructorPractice("Lalita", 101);
		System.out.println(s1.sname);
		System.out.println(s1.sno);
		System.out.println(s1.cname);
		System.out.println("*****************************************************************");
		
		ConstructorPractice s2= new ConstructorPractice("Sonam", 102);
		System.out.println(s2.sname);
		System.out.println(s2.sno);
		System.out.println(s2.cname);
		

	}

}
