package com.tnsif.daynine;

public class StringDemo {

	public static void main(String[] args) {
		
		String s = new String("Kamini");//way1 heap/string constant pool
		s.concat("Achari");//string object are immutable -- cannot be modified
        System.out.println(s);
        
		//String and String Buffer
	
        StringBuffer s1 = new StringBuffer("Kamini");//way1 heap/string constant pool
		s1.append("Achari");//Mutable in nature  -- Can be modified
        System.out.println(s1);
        
        System.out.println(s.length());
        
        String l = s.toLowerCase();
        String u = s.toUpperCase();
        
        System.out.println(l);
        System.out.println(u);
        
        String s5="KAMINI";
        System.out.println(s5.equals(s));
        System.out.println(s.substring(3));//include
        System.out.println(s.substring(1,3)); //begin-include end-excluded
        
        
      
		
	}

}
