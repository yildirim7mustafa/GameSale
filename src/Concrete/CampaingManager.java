package Concrete;

import Entities.Campaing;
import abstracts.CampaingService;

public class CampaingManager implements CampaingService{

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+ " eklendi");
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+ " silindi");
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+ " guncellendi");
		
	}

}
