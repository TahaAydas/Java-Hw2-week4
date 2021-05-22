package week_4_camp_java_hw_2.entities.concretes;

import week_4_camp_java_hw_2.entities.abstracts.Entity;

public class Game implements Entity{
	private int id;
	private String productName;
	
	public Game() {
		
	}

	public Game(int id, String productName) {
		
		this.id = id;
		this.productName = productName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	
	
}
