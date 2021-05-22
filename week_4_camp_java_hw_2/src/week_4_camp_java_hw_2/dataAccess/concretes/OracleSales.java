package week_4_camp_java_hw_2.dataAccess.concretes;

import week_4_camp_java_hw_2.dataAccess.abstracts.SalesRecordDao;
import week_4_camp_java_hw_2.entities.concretes.Campaign;
import week_4_camp_java_hw_2.entities.concretes.Sales;

public class OracleSales implements SalesRecordDao{

	@Override
	public void CreateBill(Sales sales) {
		
		System.out.println(" Fatura Basariyla olusturuldu.");
	}

	@Override
	public void integrateCampaign(Sales sales, Campaign campaign) {
		sales.setPrice(sales.getPrice()-(sales.getPrice()*campaign.getDiscount()));
		System.out.println("Yeni fatura eklendi oyun adi:"+sales.getGame().getProductName()+
				" Fiyat:"+sales.getPrice()+" Oyuncu Adi:"+ 
				sales.getGamer().getFirstName()+" "+sales.getGamer().getLastName());
	}

	
}
