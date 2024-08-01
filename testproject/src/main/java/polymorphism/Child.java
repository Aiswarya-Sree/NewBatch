package polymorphism;

public class Child extends Parent {

	public void sum()    //both parent and child has same method name , same datatypes, same values
	{
		int c=b-a;
		System.out.println(c);
		super.sum(); //calls methods of parent class
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Child c= new Child();
		c.sum();
		
		
	}

}
