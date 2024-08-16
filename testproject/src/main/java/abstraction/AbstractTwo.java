package abstraction;

public class AbstractTwo extends AbstractOne { //wihtout clicking unimplemneted method this line shows errors

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractTwo obj=new AbstractTwo();
		obj.inmethod(); 
		obj.print();
		obj.display();
		obj.method();
		
		
	}

	@Override    // this auotmatically came when the class was extended
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("study abstract class");
	}
public void display()
{
	System.out.println("instance of abstarct two class");
}
}
