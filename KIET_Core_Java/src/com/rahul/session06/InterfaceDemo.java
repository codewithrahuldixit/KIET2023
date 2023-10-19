package com.rahul.session06;
interface I1{
	int x=90;
	void show();
	boolean compare(int x , int y);
}
class I1impl implements I1{

	@Override
	public void show() {
		System.out.println("Interface demo");
		
	}

	@Override
	public boolean compare(int x, int y) {
		// TODO Auto-generated method stub
		return x!=y;
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		I1 i = new I1impl();
		i.show();
	}

}
