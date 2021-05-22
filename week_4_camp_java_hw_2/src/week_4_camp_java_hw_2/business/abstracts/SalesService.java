package week_4_camp_java_hw_2.business.abstracts;

import week_4_camp_java_hw_2.entities.concretes.Campaign;
import week_4_camp_java_hw_2.entities.concretes.Sales;

public interface SalesService {
	void BillRequest(Sales sales);
	void integrateCampaign(Sales sales,Campaign campaign);
}
