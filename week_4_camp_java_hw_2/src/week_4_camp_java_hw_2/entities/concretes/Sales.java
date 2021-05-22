package week_4_camp_java_hw_2.entities.concretes;

import week_4_camp_java_hw_2.entities.abstracts.Entity;

public class Sales implements Entity{
	private int id;
	private double price;
	private Game game;
	private Gamer gamer;
	
	public Sales() {
		
	}

	public Sales(int id, double price, Game game, Gamer gamer) {
		super();
		this.id = id;
		this.price = price;
		this.game = game;
		this.gamer = gamer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}
	
	
}
