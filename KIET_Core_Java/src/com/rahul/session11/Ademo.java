package com.rahul.session11;

public class Ademo {
public static void main(String[] args) {
	A a1 = new A("Rahul");
	System.out.println(a1);
	A a2 = new A(22);
	System.out.println(a2);
	Integer s = a1.getX();
	System.out.println(s   );
	Integer i1 = (Integer)a2.getX();
	System.out.println(i1);
}
}
