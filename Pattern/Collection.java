package org.alphatechsolutions;
import java.util.*;

public class Collection {

	public static void main(String[] args) {
		
		String[]arr = {"a","b","c","d"};
		System.out.println(arr);
		
		ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
		System.out.println(arrList);
		
		
		HashSet<Integer> some = new HashSet<>();
		some.add(9);
		some.add(5);
		some.add(8);
		System.out.println(some);
		
		for(Integer i : some) {
			System.out.println(i);
		}
		
		Iterator iter = some.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		LinkedHashSet<String> list = new LinkedHashSet<>(arrList);
		list.add("A");
		list.add("D");
		list.add("A");
		System.out.println(list);
		list.remove("D");
		
		HashMap<String,String> map = new HashMap<>();
		map.put("Name","Manimuthu");
		map.put("Class","Java");
		System.out.println(map);
		map.remove("Name");
		System.out.println(map);
		
		
		LinkedHashMap<String,String> nm = new LinkedHashMap<>();
		nm.put("one", "Java");
		nm.put("two", "JS");
		System.out.println(nm);
		nm.remove("one");
		System.out.println(nm);
	}

}



