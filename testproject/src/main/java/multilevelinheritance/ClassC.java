package multilevelinheritance;

public class ClassC extends ClassB{
	public void display()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC obj=new ClassC();
		obj.add();
		obj.subtract();
		obj.display();
	}

}
