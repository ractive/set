package com.example.set;

import java.util.LinkedList;

public class HashSet<T> implements Set<T> {

	private static final int BUCKET_SIZE = 16;
	private final LinkedList<T>[] buckets = new LinkedList[BUCKET_SIZE];
	
	public HashSet() {
		for (int i = 0; i < BUCKET_SIZE; ++i) {
			buckets[i] = new LinkedList<>();
		}
	}
	
	public void add(T elem) {
		LinkedList<T> bucketList = bucketList(elem);
		if (!bucketList.contains(elem)) {
			bucketList.add(elem);
		}
	}

	public void remove(T elem) {
		bucketList(elem).remove(elem);
	}

	public boolean contains(T elem) {
		return bucketList(elem).contains(elem);
	}

	private LinkedList<T> bucketList(T elem) {
		int bucket = elem.hashCode() % BUCKET_SIZE;
		return buckets[bucket];
	}
}
