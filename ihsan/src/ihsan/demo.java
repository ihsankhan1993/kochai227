package ihsan;


import java.util.Iterator;

import ihsan.calculator.Item;

public class demo {

	public static void main(String[] args) {

		Item i1 = new Item("bag",20 );
		Item i2 = new Item("clothes", 30);
		Item i3 = new Item("crickt bat", 8);

	shipinglist shipinglist=new shipinglist();
		shipinglist.addItem(i1);
		shipinglist.addItem(i2);
		shipinglist.addItem(i3);

		System.out.println("Displaying shipinglist:");
		Iterator iterator = shipinglist.iterator();
		while (iterator.hasNext()) {
			Item item = (Item) iterator.next();
			System.out.println(item);
		}

		System.out.println("\nRemoving last item returned");
		iterator.remove();

		System.out.println("\nDisplaying shipinglist:");
		iterator = (Iterator) shipinglist;
		while (iterator.hasNext()) {
			Item item = (Item) iterator.next();
			System.out.println(item);
		}

	}

}

