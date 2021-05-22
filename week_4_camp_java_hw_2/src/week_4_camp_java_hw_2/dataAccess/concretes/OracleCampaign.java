package week_4_camp_java_hw_2.dataAccess.concretes;

import week_4_camp_java_hw_2.dataAccess.abstracts.CampainDao;
import week_4_camp_java_hw_2.entities.concretes.Campaign;

public class OracleCampaign implements CampainDao{

	@Override
	public void Insert(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Oracle ile eklendi");
	}

	@Override
	public void Update(Campaign campaign, int id, double discount) {
		// TODO Auto-generated method stub
		campaign.setId(id);
		campaign.setDiscount(discount);
	}

	@Override
	public void Delete(Campaign campaign) {
		// TODO Auto-generated method stub
		campaign=null;
		System.out.println("Oracle ile silindi");
	}

}
