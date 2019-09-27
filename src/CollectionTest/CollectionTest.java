package CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		ArrayList<String> arrayStr = new ArrayList<>();

		arrayStr.add("banana");
		arrayStr.add("apple");
		arrayStr.add("mango");

		for (String value : arrayStr) {
			System.out.println(value);
		}
		
		arrayStr.remove(2);
		System.out.println();
		for (int i = 0; i < arrayStr.size(); i++) {
			System.out.println(arrayStr.get(i));
		}

		arrayStr.remove(0);
		System.out.println();
		Iterator<String> it = arrayStr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
