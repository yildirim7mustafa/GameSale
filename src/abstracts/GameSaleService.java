package abstracts;

import Entities.Campaing;
import Entities.Game;
import Entities.Player;

public interface GameSaleService {
	void sale(Player player, Game game,Campaing campaing);
}
