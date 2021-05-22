package week_4_camp_java_hw_2.dataAccess.abstracts;

import java.time.LocalDate;

import week_4_camp_java_hw_2.entities.concretes.Gamer;

public interface GamerDao {
	void Insert(Gamer gamer);
	void Update(Gamer gamer,String firstName, String lastName, LocalDate dateOfBirth, String nationalityId);
	void Delete(Gamer gamer);
}
