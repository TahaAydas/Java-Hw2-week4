package week_4_camp_java_hw_2.business.concretes;

import java.time.LocalDate;

import week_4_camp_java_hw_2.business.abstracts.GamerService;
import week_4_camp_java_hw_2.core.abstracts.GamerCheckService;
import week_4_camp_java_hw_2.dataAccess.abstracts.GamerDao;
import week_4_camp_java_hw_2.entities.concretes.Gamer;

public class GamerManager implements GamerService{

	private GamerDao gamerDao;
	private GamerCheckService gamerService;
	
	public GamerManager(GamerDao gamerDao,GamerCheckService gamerService) {
		
		this.gamerDao = gamerDao;
		this.gamerService=gamerService;
	}

	@Override
	public void SignUp(Gamer gamer) {
		if(this.gamerService.checkIfRealPerson(gamer)) {
			this.gamerDao.Insert(gamer);
			System.out.println("Yeni oyuncu eklendi kullanici adi:"+gamer.getFirstName()+" Soyadi:"+gamer.getLastName()+" Dogum Yili:"+ gamer.getDateOfBirth().getYear()+" TC NO:"+gamer.getNationalityId());
		}
		else {
			System.out.println("Oyucu ekleme basarisiz. Boyle bir kisi yok");
		}
		
		}

	@Override
	public void Update(Gamer gamer, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		if(this.gamerService.checkIfRealPerson(nationalityId,firstName,lastName,dateOfBirth.getYear())) {
			this.gamerDao.Update(gamer, firstName, lastName, dateOfBirth, nationalityId);
			System.out.println("Oyuncu guncellendi kullanici adi:"+gamer.getFirstName()+" Soyadi:"+gamer.getLastName()+" Dogum Yili:"+ gamer.getDateOfBirth().getYear()+" TC NO:"+gamer.getNationalityId());
		}
		else {
			System.out.println("Oyuncu guncelleme basarisiz. Boyle bir kisi mernis ile uyusmuyor");
		}
		
		
		
	}

	@Override
	public void Remove(Gamer gamer) {
		this.gamerDao.Delete(gamer);
		System.out.println("Oyuncu silindi");
	}

}
