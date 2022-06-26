package Concrete;

import Entities.Game;
import abstracts.GameService;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" silindi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" guncellendi.");
		
	}

}
