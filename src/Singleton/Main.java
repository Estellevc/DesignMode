package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1==obj2);
	}

}
