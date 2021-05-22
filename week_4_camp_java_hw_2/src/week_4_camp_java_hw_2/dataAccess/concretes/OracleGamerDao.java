package week_4_camp_java_hw_2.dataAccess.concretes;

import java.time.LocalDate;

import week_4_camp_java_hw_2.dataAccess.abstracts.GamerDao;
import week_4_camp_java_hw_2.entities.concretes.Gamer;

public class OracleGamerDao implements GamerDao{

	@Override
	public void Insert(Gamer gamer) {
		System.out.println("Oracle ile eklendi");	
	}

	@Override
	public void Update(Gamer gamer,String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		gamer.setFirstName(firstName);
		gamer.setLastName(lastName);
		gamer.setDateOfBirth(dateOfBirth);
		gamer.setNationalityId(nationalityId);
		
	}

	@Override
	public void Delete(Gamer gamer) {
		gamer.setFirstName(null);
		gamer.setLastName(null);
		gamer.setDateOfBirth(null);
		gamer.setNationalityId(null);
		
	}

}
