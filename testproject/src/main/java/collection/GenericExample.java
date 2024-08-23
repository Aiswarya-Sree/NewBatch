package collection;

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> obj=new ArrayList<Integer> ();
obj.add(121);
obj.add(122);
obj.add(123);
obj.add(124);
obj.add(125);

System.out.println(obj);
obj.remove(0); //remove element from list
System.out.println(obj);
int length=obj.size(); //get size of array
System.out.println(length);
boolean b =obj.contains(122);//check if an element is present in an array and return true or false
System.out.println(b);
System.out.println(obj.get(3)); //get the element that is present in the 3rd index position
obj.removeAll(obj); 
System.out.println(obj);
	}

}
