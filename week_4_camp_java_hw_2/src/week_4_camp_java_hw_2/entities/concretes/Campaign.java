package week_4_camp_java_hw_2.entities.concretes;

import week_4_camp_java_hw_2.entities.abstracts.Entity;

public class Campaign implements Entity{
	private int id;
	private double discount;
	
	public Campaign() {
		super();
	}

	public Campaign(int id, double discount) {
		super();
		this.id = id;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
