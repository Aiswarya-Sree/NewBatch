package interfacepackage;

public  class Intermain implements InterfaceB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intermain obj=new Intermain();
		obj.methodA();
		obj.methodB();
	}
public void methodA()
{
	System.out.println("print method A");
}
public void methodB()
{
	System.out.println("print method B");
}
}
