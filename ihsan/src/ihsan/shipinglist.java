package ihsan;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import ihsan.calculator.Item;

public class shipinglist {

	ArrayList shipinglist;

	public shipinglist() {
	 shipinglist= new ArrayList();
	}

	public void addItem(Item item) {
		shipinglist.add(item);
	}

	public Iterator<Item> iterator() {
		return new listIterator();
	}

	class listIterator implements Iterator<Item> {
		int currentIndex = 0;

		@Override
		public boolean hasNext() {
			if (currentIndex >= shipinglist.size()) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public Item next() {
			return (Item) shipinglist.get(currentIndex++);
		}

		@Override
		public void remove() {
			shipinglist.remove(--currentIndex);
		}

	}

}
