package FactoryMethod.idcard;

import java.util.*;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;

public class IDCardFactory extends Factory{
	private List owner = new ArrayList();
	@Override
	public Product createProduct(String owner) {
		// TODO Auto-generated method stub		
		return new IDCard(owner);
	}

	@Override
	public void registerProduct(Product p) {
		// TODO Auto-generated method stub
		owner.add(((IDCard) p).getOwner());
	}

}
