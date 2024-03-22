package com.tnsif.dayseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Demo on the basics of Stream API
public class StreamDemo {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(10,20,30,40,50,60,70,80,90);
		 System.out.println(stream.count());
		 
		 //Array elements into stream
		 Integer[] values = new Integer[] {1,2,3,4,5};
		 stream = Arrays.stream(values);
		 System.out.println(Arrays.toString(values));
		 
		 stream= stream.map(m->m*m);
		 stream.forEach(System.out::println);
		 
		 List<String> words= Arrays.asList("Hello","Good", "Evening");
		 
		 Stream<String> stream1 = words.stream();
		 System.out.println("....  UPPERCASE WORDS  ....");
		 List<String> s1 =stream1.map(str->str.toUpperCase()).collect(Collectors.toList());
		 System.out.println(s1);
		 
		 System.out.println("..... LOWERCASE WORDS .....");
		 stream1 = words.stream();
		 stream1.map(str->str.toLowerCase()).forEach(System.out::println);
		 
		 System.out.println("***** ORIGINAL WORDS *****");
		 System.out.println(words);
		 
		 
		 
		 
	
		 
		 
		 
	}

}
