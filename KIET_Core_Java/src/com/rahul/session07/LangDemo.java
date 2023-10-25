package com.rahul.session07;
class AB{
	public String toString() {
        return "This is class AB";
    }
}
public class LangDemo {
public static void main(String[] args) {
	AB a1 = new AB();
	
	String s = a1.toString();
	System.out.println(s);
	
	System.out.println(a1.toString());
	System.out.println(a1);
}
}
