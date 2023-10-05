package com.rahul.session03;
//The type B cannot subclass the final class A
public class B extends A{
int y ;

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
	//The field A.x is not visible
	super.x=20;
}

}
