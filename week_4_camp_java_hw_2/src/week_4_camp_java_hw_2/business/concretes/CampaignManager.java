package week_4_camp_java_hw_2.business.concretes;

import week_4_camp_java_hw_2.business.abstracts.CampaignService;
import week_4_camp_java_hw_2.dataAccess.abstracts.CampainDao;
import week_4_camp_java_hw_2.entities.concretes.Campaign;

public class CampaignManager implements CampaignService{
	
	private CampainDao campainDao;
	
	public CampaignManager(CampainDao campainDao) {
		super();
		this.campainDao = campainDao;
	}

	@Override
	public void Add(Campaign campaign) {
		
		this.campainDao.Insert(campaign);
		System.out.println("Yeni kampanya eklendi indirim:"+campaign.getDiscount());
	}

	@Override
	public void Update(Campaign campaign, int id, double price) {
		this.campainDao.Update(campaign, id, price);
		System.out.println("Yeni kampanya eklendi indirim:"+campaign.getDiscount());
	}

	@Override
	public void Remove(Campaign campaign) {
		this.campainDao.Delete(campaign);
		System.out.println("Yeni kampanya silindi indirim:"+campaign.getDiscount());
	}

}
