package com.rahul.session09;

public class WrapperDemo {
public static void main(String[] args) {
	/*Integer i1 = -128;
	Integer i2 = -128;
	
	System.out.println(Integer.toHexString(15));
	System.out.println(Integer.toBinaryString(15));
	int i = Integer.parseInt("145");
	System.out.println(i);
	int x = i1.intValue();
	System.out.println(x);*/
	Integer i = Integer.valueOf("ABC",37);
	System.out.println(i);
}
}
