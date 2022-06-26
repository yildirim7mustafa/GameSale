package Concrete;

import Entities.Campaing;
import Entities.Game;
import Entities.Player;
import abstracts.GameSaleService;

public class GameSaleManager implements GameSaleService{

	@Override
	public void sale(Player player, Game game, Campaing campaing) {
		System.out.println(player.getFirstName()+" " +game.getName()+" oyununu "+ campaing.getCampaingName()+ " ile aldi. ");
	}

}
