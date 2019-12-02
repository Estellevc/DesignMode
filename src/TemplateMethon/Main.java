package TemplateMethon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDisplay d1 = new CharDisplay('H');
		d1.display();
		System.out.println();
		AbstractDisplay d2 = new StringDisplay("Hello World");
		d2.display();
		
	}

}
