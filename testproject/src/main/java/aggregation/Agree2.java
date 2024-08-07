package aggregation;

public class Agree2 {
	//int a;
	String name;
	Agree1 ag; //reference variable of class agree1
	
	public  Agree2(Agree1 ag, String name)
	{
		//this.a=a;
		this.name=name;
		this.ag=ag;
	}
	
	public void display()
	{
		System.out.println(ag.x);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agree1 ag1=new Agree1(5);
		Agree2 ag2=new Agree2(ag1,"hello"); // obj name of parent class
		ag2.display();
	}

}
