package com.example.set;

import java.util.ArrayList;
import java.util.List;

public class ListBasedSet<T> implements Set<T> {

	private List<T> store = new ArrayList<T>();
	
	public void add(T elem) {
		if (!contains(elem)) {
			store.add(elem);
		}
	}

	public void remove(T elem) {
		store.remove(elem);
	}

	public boolean contains(T elem) {
		return store.contains(elem);
	}
}
