import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entities.Campaing;
import Entities.Game;
import Entities.Player;
import Entities.StudentCampaing;

public class Main {

	public static void main(String[] args) {
		Player mustafa = new Player(0, "Mustafa", "Yildirim");
		Player ahmet = new Player(1, "Ahmet", "Yildirim");
		
		Campaing kampanya10= new Campaing(0, "YUZDE10", 10);
		Campaing kampanya12= new Campaing(1, "YUZDE12", 12);
		
		Game cod = new Game(0, "Call Of Duty", 60);
		Game ageOf = new Game(1, "Age Of Empires", 80);
		
		Campaing ogrenci15 = new StudentCampaing(1, "OGRENCI15", 15);
		Campaing ogrenci20 = new StudentCampaing(2, "OGRENCI20", 20);
		
		GameManager gameManager = new GameManager();
		gameManager.add(ageOf);
		gameManager.add(cod);
		gameManager.delete(ageOf);
		
		PlayerManager playerManager = new PlayerManager();
		playerManager.add(ahmet);
		playerManager.add(mustafa);
		playerManager.delete(ahmet);
		
		CampaingManager campaingManager = new CampaingManager();
		campaingManager.add(ogrenci20);
		campaingManager.add(kampanya10);
		campaingManager.delete(kampanya10);
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sale(ahmet, ageOf, ogrenci20);
		gameSaleManager.sale(mustafa, cod, kampanya12);
		
	
	}

}
