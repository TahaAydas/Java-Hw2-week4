package week_4_camp_java_hw_2.business.abstracts;

import week_4_camp_java_hw_2.entities.concretes.Campaign;

public interface CampaignService {
	void Add(Campaign campaign);
	void Update(Campaign campaign,int id,double price);
	void Remove(Campaign campaign);
}
