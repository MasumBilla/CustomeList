 package com.Collections.maven_custom;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;;

public class BookList<E> implements Collection<E> {

	int MAX_SIZE;
	int SIZE;
	E[] Array;

	int increment = 5;

	public BookList() {

		MAX_SIZE = 5;
		SIZE = 0;
		Array = (E[]) new Object[5];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return SIZE;
	}

	@Override
	public boolean isEmpty() {
		if(SIZE == 0)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		if (SIZE == MAX_SIZE) {
			reallocation(increment);
		}
		Array[SIZE] = e;
		SIZE++;
		return true;
	}

	public Object get(int id) {
		if (id < 0) {
			return NullPointerException.class;
		} else if (id >= SIZE) {
			return ArrayIndexOutOfBoundsException.class;
		} else {
			return Array[id];
		}
	}

	public Object remove(int pos) {
		if (pos < 0) {
			return NullPointerException.class;
		} else if (pos >= SIZE) {
			return ArrayIndexOutOfBoundsException.class;
		} else {
			System.arraycopy(Array, pos + 1, Array, pos, SIZE - pos - 1);
			SIZE--;
		}

		return true;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		if (c.size() + SIZE > MAX_SIZE) {
			reallocation(c.size() + SIZE - MAX_SIZE);
		}

		System.arraycopy(c.toArray(), 0, Array, this.size(), c.size());
		SIZE += c.size();
		return true;
	}

	private boolean reallocation(int increment) {
		MAX_SIZE += increment;
		Array = Arrays.copyOf(Array, MAX_SIZE);
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		SIZE = 0;
		Array = (E[]) new Object[5];

	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

}
