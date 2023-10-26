package com.rahul.session07;
class AB{
	private int r;
	public AB() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AB(int r) {
		super();
		this.r = r;
	}
	public String toString() {
        return "This is class AB";
    }
	public boolean equals(AB a2) {
		return this.r==a2.r;
		
	}
}
public class LangDemo {
public static void main(String[] args) {
	AB a1 = new AB(4);
	AB a2 = new AB(4);
	
	
	//String s = a1.toString();
	//System.out.println(s);
	
	//System.out.println(a1.toString());
	System.out.println(a1.equals(a2));
}
}
