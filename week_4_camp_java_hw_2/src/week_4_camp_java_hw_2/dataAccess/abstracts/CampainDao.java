package week_4_camp_java_hw_2.dataAccess.abstracts;

import week_4_camp_java_hw_2.entities.concretes.Campaign;

public interface CampainDao {
	void Insert(Campaign campaign);
	void Update(Campaign campaign,int id,double discount);
	void Delete(Campaign campaign);
}
