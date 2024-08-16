package exception;

public class TryCatch {
public void div()
{
	try
	{
	int a=10;
	System.out.println(a/0);
}
	catch(Exception a)
	{
		System.out.println("execption handled" +a);
	}
	finally {
		System.out.println("execption handled in finally");	
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TryCatch t=new TryCatch();
t.div();
	}

}
