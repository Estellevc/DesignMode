package FactoryMethod.idcard;

import FactoryMethod.framework.Product;

public class IDCard extends Product{
	private String owner;
	IDCard(String owner){
		System.out.println("����"+owner+"��IDCard");
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("ʵ��"+owner+"��IDCard");
	}
	
	
}
