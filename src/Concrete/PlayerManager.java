package Concrete;

import Entities.Player;
import abstracts.PlayerService;

public class PlayerManager implements PlayerService {

	@Override
	public void add(Player player) {
		System.out.println(player.getFirstName()+" eklendi.");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()+" silindi.");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName()+" guncellendi.");
		
	}

}
