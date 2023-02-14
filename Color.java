package Collection;

import java.util.ArrayList;
import java.util.List;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= new ArrayList<String>();
		list.add("Green");
		list.add("Red");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		System.out.println(list);
		System.out.println(list.size());
		if(list.contains("Black"))
		{
			System.out.println(" String is found");
		}
		else
			System.out.println("There is no such Strings");
		
		//list.remove(2);
		//System.out.println(list);
		//Iterator<String> str=list.iterator();
		//while(str.hasNext())
		//{
			//System.out.println(str.next());
		//}	
		
		//System.out.println(list);
		//System.out.println("First element = " + list.get(0));
		//System.out.println("Fourth element = " + list.get(3));
		//for (String str: list)
		//{
			//System.out.println(str);
		//}
}

}

