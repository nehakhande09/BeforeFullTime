package Singleton;

import org.apache.poi.ss.usermodel.Row;

public class A {
	
	int a=10;
	void m1()
	{
		a=a+30;
	}
public static void main(String[] args) {
	A a=new A();
	a.m1();
	/*A a=new A();
	a1.m1();
	A a=new A();
	a1.m1();*/
}
public Row getrowfromme(int i) {
	// TODO Auto-generated method stub
	return null;
}
}
