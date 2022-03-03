
public class ChildClass extends AbstractDemo
{

	public static void main(String[] args) 
	{
		ChildClass c= new ChildClass();
		c.m2();
		

	}

	@Override
	public void m2()
	{
	System.out.println("this is overriden method");
		
	}

	

}
