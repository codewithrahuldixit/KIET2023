package com.rahul.session11;

public class B <T extends Number>
//Generic Bounded Types
{
private T x;

public T getX() {
	return x;
}

public void setX(T x) {
	this.x = x;
}

public B() {
	super();
	// TODO Auto-generated constructor stub
}

public B(T x) {
	super();
	this.x = x;
}

@Override
public String toString() {
	return "B [x=" + x + "]";
}

}
