package hwpolymorphism;

public class Child extends Parent{
	
	public int div()
	{
	super.div();
		if(super.c %10==0)
		{
	      System.out.println("divisibe by 10");
		}
	else
		
	{
		System.out.println("not divisibe by 10");	
	}
	return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj=new Child();
obj.div();

	}

}
