package finalkeyword;

public class Final extends FinalExample{
  final int a=10;
	/*public Final()
{
	int a=10;
	}*/
  public final void display()
  {
	 System.out.println("hello");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Final obj=new Final();
  obj.display();
  System.out.println(obj.a);
  obj.print();
  
	}

}
