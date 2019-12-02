package TemplateMethon;

public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	//被final修饰的方法不能被重写。
	public final void display() {
		open();
		for(int i = 0;i<5;i++) {
			print();
		}
		close();
	}
}
