package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<Integer>();
		list.add(39);
		list.add(70);
		list.add(21);
		list.add(10);
		list.add(4);

		System.out.println(list);
		if(list.contains(70))
		{
			System.out.println(true);
		}
		if(list.isEmpty())
		{
			System.out.println("Empty List");
		}
		
		
		Iterator<Integer> i=list.iterator();
		while(i.hasNext())
		{
			Integer a=i.next();
			System.out.println(a);
		}	
		
		list.remove(2);
		System.out.println(list);
		list.set(3,100);
		System.out.println(list);

	}

}
