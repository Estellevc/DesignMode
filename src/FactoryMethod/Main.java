package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("aa");
		Product card2 = factory.create("bb");
		Product card3 = factory.create("bb");
		card1.use();
		card2.use();
		card3.use();
	}

}
