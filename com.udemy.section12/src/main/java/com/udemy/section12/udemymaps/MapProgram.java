package com.udemy.section12.udemymaps;

import java.util.*;

public class MapProgram {

	public static void main(String[] args) {

		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "A compiled high-level, object-oriented, platform independent language.");
		languages.put("Python", "An interpreted, object oriented, high-level programming language with dynamic semantics.");
		languages.put("Algol", "An algorithmic language.");
		languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code.");
		languages.put("Lisp", "Therein lies madness.");
//		System.out.println(languages.put("Lisp", "Example"));

//		if(languages.containsKey("Java")) {
//			System.out.println("Java is already a key within the Map.");
//		} else {
//			languages.put("Java", "Another example within Java :)");
//		}

//		System.out.println(languages.get("Java"));
//		languages.put("Java", "This course is about Java.");
//		System.out.println(languages.get("Java"));

		for(String key: languages.keySet()) {
			System.out.println(key + " : " + languages.get(key));
		}

	}//Main

}//Class
