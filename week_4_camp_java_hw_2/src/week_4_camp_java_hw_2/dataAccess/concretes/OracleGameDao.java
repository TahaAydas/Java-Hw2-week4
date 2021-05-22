package week_4_camp_java_hw_2.dataAccess.concretes;

import week_4_camp_java_hw_2.dataAccess.abstracts.GameDao;
import week_4_camp_java_hw_2.entities.concretes.Game;

public class OracleGameDao implements GameDao{

	@Override
	public void Insert(Game game) {
		System.out.println(game.getProductName()+" adli oyun basariyla eklendi.");
		
	}

}
