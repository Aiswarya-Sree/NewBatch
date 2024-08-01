package inheritance;

public class Child extends Parent{
	public void display()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Child obj=new Child();
			obj.display();
			obj.add();
		}
	}

}
