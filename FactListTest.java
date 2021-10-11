package gui;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactListTest {
	FactList f = new FactList();
	
	Fact q = new Fact("jim", "history", "Big History");
	Fact w = new Fact("wendy", "geology", "Big rock");
	Fact e = new Fact("candace", "math", "Big Math");
	@Test
	//Test Null
	public void nullSearchTest() {
		FactList z = f.search("jim",0);
		assertNull("Empty List", f);
	}
	// Test Author
	public void authorSearchTest() {
		 f.set(q);
		 f.set(w);
		 f.set(e);
		
		 FactList z = f.search("jim",0);
		assertThat("Author Search Test",q, not(equalTo(someOtherObject)));
	}
	
	// Test Value
	 f.set(q);
	 f.set(w);
	 f.set(e);
	 FactList z = f.search("history",1);
	 assertThat("Value Search Test",q, not(equalTo(someOtherObject)));
	
	// Test Text
	 f.set(q);
	 f.set(w);
	 f.set(e);
	 FactList z = f.search("Big History",2);
	assertThat("Text Search Test",q, not(equalTo(someOtherObject)));
	
	// Test All
	 f.set(q);
	 f.set(w);
	 f.set(e);
	 FactList z = f.search("jim",3);
	assertThat("All Search Test",q, not(equalTo(someOtherObject)));
	
	//Test unknown input
	// Test All
		 f.set(q);
		 f.set(w);
		 f.set(e);
		 FactList z = f.search("jim",3);
		assertThat("All Search Test",q, not(equalTo(someOtherObject)));
}
