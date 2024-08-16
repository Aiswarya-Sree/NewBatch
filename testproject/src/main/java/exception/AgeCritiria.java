package exception;

public class AgeCritiria {
	public void votingAge()
	{
	int age=2;
	if(age>=18)
	{
		System.out.println("eligible");
	}
	else
	{
		//System.out.println("not eligible");
		throw new ArithmeticException("not handled");
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeCritiria a=new AgeCritiria();
		a.votingAge();

	}
}


