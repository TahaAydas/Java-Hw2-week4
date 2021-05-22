package week_4_camp_java_hw_2.core.abstracts;

import week_4_camp_java_hw_2.entities.concretes.Gamer;

public interface GamerCheckService {
	boolean checkIfRealPerson(Gamer gamer);
	boolean checkIfRealPerson(String nationalityId,String firstName,String lastName,int  year);
}
