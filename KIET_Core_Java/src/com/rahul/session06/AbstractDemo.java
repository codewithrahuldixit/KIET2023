package com.rahul.session06;
abstract class XYZ{
	int x;
	public void show() {
		System.out.println("Show of XYZ");
	}
	abstract void sum(int x , int y);
}
class ChildXYZ extends XYZ{
	//The type ChildXYZ must implement the 
	//inherited abstract method XYZ.sum(int, int)
	public void show() {
		System.out.println("Show of ChildXYZ");
	}

	@Override
	void sum(int x, int y) {
		System.out.println(x+y);
		
	}
} 
public class AbstractDemo {
	public static void main(String[] args) {
		XYZ x1 = new ChildXYZ();
		x1.show();
	}

}
