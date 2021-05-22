package week_4_camp_java_hw_2.core.concretes;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import week_4_camp_java_hw_2.core.abstracts.GamerCheckService;
import week_4_camp_java_hw_2.entities.concretes.Gamer;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		// TODO Auto-generated method stub
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}

	@Override
	public boolean checkIfRealPerson(String nationalityId, String firstName, String lastName, int year) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(nationalityId),firstName,lastName,year);
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}

	
	
	
}
