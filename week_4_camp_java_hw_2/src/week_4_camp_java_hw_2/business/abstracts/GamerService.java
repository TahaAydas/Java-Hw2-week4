package week_4_camp_java_hw_2.business.abstracts;

import java.time.LocalDate;

import week_4_camp_java_hw_2.entities.concretes.Gamer;

public interface GamerService {
	void SignUp(Gamer gamer);
	void Update(Gamer gamer,String firstName, String lastName, LocalDate dateOfBirth, String nationalityId);
	void Remove(Gamer gamer);
}
