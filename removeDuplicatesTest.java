package gui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class removeDuplicatesTest {

	@Test
	public void removeDuplicatesTest() {
		words= new ArrayList<String>();
		words.add("orange");
		 words.add("apple");
		 words.add("apple");
		 words.add("banana");
		 
		itr = list.iterator();
		itr.remove();
		assertTrue(list.removeDuplicates());
		
	}

}
