package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterfaceListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj=new ArrayList<Integer>();
		obj.add(111);
		obj.add(222);
		obj.add(333);
		System.out.println(obj);
Iterator itr= obj.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
for(int i:obj)
{
	System.out.println(obj);
}
	}

}
