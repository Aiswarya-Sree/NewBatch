package abstraction;

public class InterfaceClass implements Interfaceone,InterfaceTwo //wihtout clicking unimplemneted method this line shows errors
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass obj=new InterfaceClass();
		obj.method1();
		//syntax interfacename object name = new class name 
		Interfaceone obj1=new InterfaceClass(); //INTERFACE OBJECT CREATION ==VERY IMPORTAnt
	    obj1.method1(); //to call methdods inside interface
	    obj.method4();
	}
	

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println("print c =  "+c);
	}


	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("print multiple inheritance");
	}

}
