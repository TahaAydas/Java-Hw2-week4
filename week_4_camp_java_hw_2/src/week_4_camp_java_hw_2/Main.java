package week_4_camp_java_hw_2;

import java.time.LocalDate;

import week_4_camp_java_hw_2.business.abstracts.CampaignService;
import week_4_camp_java_hw_2.business.abstracts.GamerService;
import week_4_camp_java_hw_2.business.abstracts.SalesService;
import week_4_camp_java_hw_2.business.concretes.CampaignManager;
import week_4_camp_java_hw_2.business.concretes.GamerManager;
import week_4_camp_java_hw_2.business.concretes.SalesManager;
import week_4_camp_java_hw_2.core.concretes.MernisServiceAdapter;
import week_4_camp_java_hw_2.dataAccess.concretes.OracleCampaign;
import week_4_camp_java_hw_2.dataAccess.concretes.OracleGamerDao;
import week_4_camp_java_hw_2.dataAccess.concretes.OracleSales;
import week_4_camp_java_hw_2.entities.concretes.Campaign;
import week_4_camp_java_hw_2.entities.concretes.Game;
import week_4_camp_java_hw_2.entities.concretes.Gamer;
import week_4_camp_java_hw_2.entities.concretes.Sales;

public class Main {

	public static void main(String[] args) {
		
		GamerService gamerService=new GamerManager(new OracleGamerDao(),new MernisServiceAdapter());
		Gamer gamer=new Gamer(0,"Taha","Aydas",LocalDate.of(2015,10,25),"123456789");
		gamerService.SignUp(gamer);
		gamerService.Update(gamer, "Taha","Aydas",LocalDate.of(2015,10,25),"123456789");
		
		CampaignService campaignService=new CampaignManager(new OracleCampaign());
		Campaign campaign=new Campaign(0,0.25);
		campaignService.Add(campaign);
		campaignService.Update(campaign, 0, 0.35);
		campaignService.Remove(campaign);
		
		SalesService salesService=new SalesManager(new OracleSales());
		Game game=new Game(0,"GTA 5 Online");
		Campaign _campaign=new Campaign(0,0.25);
		Sales _sales=new Sales(0,25.0,game,gamer);
		salesService.integrateCampaign(_sales, _campaign);
		salesService.BillRequest(_sales);
		gamerService.Remove(gamer);
		
	}

}
