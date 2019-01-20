package com.Collections.maven_custom;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BookListTest {

	@Test
	public void testAdd() {
		BookList<Book> list = new BookList<Book>();

		list.add(new Book("billa", "1", 2));
		list.add(new Book("mizan", "2", 3));
		list.add(new Book("sajal", "3", 4));
		

		assertEquals(3, list.size());
		// assertNotEquals(4,list.size());
	}

	@Test
	public void testGet() {
		BookList<Book> list = new BookList<Book>();

		list.add(new Book("billa", "1", 2));
		list.add(new Book("mizan", "2", 3));
		list.add(new Book("sajal", "3", 4));

		assertEquals(new Book("sajal", "3", 4.0), list.get(2));
		// assertNotEquals(new Book("Satyajit","Feluda",10000000), list.get(2));
	}

	@Test
	public void testAddAll() {
		BookList<Book> customlist = new BookList<Book>();

		List<Book> list = new ArrayList<Book>();

		list.add(new Book("billa", "1", 2));
		list.add(new Book("mizan", "2", 3));
		list.add(new Book("sajal", "3", 4));

		assertTrue("The whole list should be added", customlist.addAll(list));
	}

	@Test
	public void testClear() {
		BookList<Book> customlist = new BookList<Book>();

		customlist.add(new Book("romi", "1", 2));
		customlist.add(new Book("rocky", "2", 3));
		customlist.add(new Book("dipu", "3", 4.0));

		customlist.clear();
		assertTrue(customlist.isEmpty());

		customlist.add(new Book("dipu", "3", 4.0));

		assertFalse(customlist.isEmpty());
	}

	@Test
	public void testRemoveObject() {

		BookList<Book> list = new BookList<>();

        list.add(new Book ("Teach Yourself C++","Herbert Schildt",3500.0));
        
        list.add(new Book ("All The Birds In The Sky","Charlie Jane Anders",2500.0));
        
        Book b = new Book ("All The Birds In The Sky","Charlie Jane Anders",2500.0);
        
        list.remove(0);
        
        assertEquals(b.toString(), list.get(0).toString());
        
	}
	

}
