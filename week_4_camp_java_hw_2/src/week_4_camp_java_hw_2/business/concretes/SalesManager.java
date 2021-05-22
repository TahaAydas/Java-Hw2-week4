package week_4_camp_java_hw_2.business.concretes;

import week_4_camp_java_hw_2.business.abstracts.SalesService;
import week_4_camp_java_hw_2.dataAccess.abstracts.SalesRecordDao;
import week_4_camp_java_hw_2.entities.concretes.Campaign;
import week_4_camp_java_hw_2.entities.concretes.Sales;

public class SalesManager implements SalesService{

	private SalesRecordDao salesRecordDao;
	
	public SalesManager(SalesRecordDao salesRecordDao) {
		
		this.salesRecordDao = salesRecordDao;
	}
	@Override
	public void BillRequest(Sales sales) {
		this.salesRecordDao.CreateBill(sales);
		
	}
	@Override
	public void integrateCampaign(Sales sales, Campaign campaign) {
		this.salesRecordDao.integrateCampaign(sales, campaign);
		
	}
	
}
