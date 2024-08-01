package testproject1;

public class SampleProgram {

	private int a, b;
	public SampleProgram (int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public int sum()
	{
		return a+b;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleProgram x=new SampleProgram(2,3);
		int sum= x.sum();
		System.out.println(sum);
		

	}

}
 