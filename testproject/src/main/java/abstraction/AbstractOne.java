package abstraction;

public abstract class AbstractOne {
public abstract void method(); // declaration of ABSTRACT METHOD -data is hidden here
public AbstractOne()
{
System.out.println("constructor");
}
public static void print()
{
	System.out.println("static method");
}
public void inmethod()
{
	System.out.println("instance method");
}
}

