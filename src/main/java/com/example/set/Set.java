package com.example.set;

public interface Set<T> {
	void add(T elem);
	void remove(T elem);
	boolean contains(T elem);
}
