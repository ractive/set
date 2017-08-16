package com.example.set;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.example.set.ListBasedSet;
import com.example.set.Set;

@RunWith(Parameterized.class)
public class SetTests {
	
	@Parameters
	public static Iterable<Set<String>> sets() {
	    return Arrays.asList(new ListBasedSet<String>(), new HashSet<String>());
	}
	
	@Parameter
	public Set<String> set;
	
	@Test
	public void test() {
		assertFalse(set.contains("abc"));
		
		set.add("abc");
		
		assertTrue(set.contains("abc"));
		assertFalse(set.contains("def"));
		
		set.remove("abc");
		
		assertFalse(set.contains("abc"));
	}
}
