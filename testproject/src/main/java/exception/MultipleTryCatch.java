package exception;

public class MultipleTryCatch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	try {
int a[]= {1,2,3};
int b=  a[5]/0;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}
	try {
String str=null;
System.out.println(str.length());
	}
	catch (NullPointerException e)
	{
		System.out.println("NullPointerException handled");
	}

	
}}