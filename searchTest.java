package facts;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class searchTest {
// need to figure out how to access the XML file
	@Test
	void TestA1B1C1() {
		FactList a = new FactList();
		int mode = 0;
		String query = "";
		FactList result = a.search(query, mode);
		int a1 = 0;
		int b1 = mode;
		int c1 = query.length();
		assertEquals(0,a1);
		assertEquals(0,b1);
		assertEquals(0,c1);
	}
	
@Test
void TestA2B1C1() {
	FactList a = new FactList();
	int mode = 0;
	String query = "";
	FactList result = a.search(query, mode);
	int a1 = 1;
	int b1 = mode;
	int c1 = query.length();
	assertEquals(1,a1);
	assertEquals(0,b1);
	assertEquals(0,c1);
}
@Test
void TestA3B1C1() {
	FactList a = new FactList();
	int mode = 0;
	String query = "";
	FactList result = a.search(query, mode);
	int a1 = 5;
	int b1 = mode;
	int c1 = query.length();
	assertTrue(a1 > 1);
	assertEquals(0,b1);
	assertEquals(0,c1);
}
@Test
void TestA1B2C1() {
	FactList a = new FactList();
	int mode = 1;
	String query = "";
	FactList result = a.search(query, mode);
	int a1 = 0;
	int b1 = mode;
	int c1 = query.length();
	assertEquals(0,a1);
	assertEquals(1,b1);
	assertEquals(0,c1);
}
@Test
void TestA1B3C1() {
	FactList a = new FactList();
	int mode = 2;
	String query = "";
	FactList result = a.search(query, mode);
	int a1 = 0;
	int b1 = mode;
	int c1 = query.length();
	assertEquals(0,a1);
	assertEquals(2,b1);
	assertEquals(0,c1);
}
@Test
void TestA1B4C1() {
	FactList a = new FactList();
	int mode = 3;
	String query = "";
	FactList result = a.search(query, mode);
	int a1 = 0;
	int b1 = mode;
	int c1 = query.length();
	assertEquals(0,a1);
	assertEquals(3,b1);
	assertEquals(0,c1);
}
@Test
void TestA1B1C2() {
	FactList a = new FactList();
	int mode = 0;
	String query = "Glass";
	FactList result = a.search(query, mode);
	int a1 = 0;
	int b1 = mode;
	int c1 = query.length();
	assertEquals(0,a1);
	assertEquals(0,b1);
	assertTrue(c1> 0);
}

}
