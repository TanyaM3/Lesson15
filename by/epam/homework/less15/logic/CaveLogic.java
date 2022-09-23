package by.epam.homework.less15.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.homework.less15.bean.Cave;
import by.epam.homework.less15.bean.Treasure;
import by.epam.homework.less15.repo.TreasureRepository;

public class CaveLogic {

	private final Cave cave = TreasureRepository.getCave();

	private static final CaveLogic instance = new CaveLogic();

	private CaveLogic() {

	}

	public static CaveLogic getInstance() {
		return instance;
	}

	public List<Treasure> mostExpensive() {
		List<Treasure> treasures = cave.getTreasures();
		List<Treasure> mostExpensive = new ArrayList<Treasure>();
		int max = 0;
		for (int i = 0; i < treasures.size(); i++) {
			Treasure currentTreasure = treasures.get(i);
			if (currentTreasure.getPrice() == max) {
				mostExpensive.add(currentTreasure);
			} else if (currentTreasure.getPrice() > max) {
				max = currentTreasure.getPrice();
				mostExpensive.clear();
				mostExpensive.add(currentTreasure);
			}
		}
		return mostExpensive;
	}

	public List<Treasure> byPrice(int price) {
		List<Treasure> byPrice = new ArrayList<Treasure>();
		List<Treasure> treasures = cave.getTreasures();
		for (int i = 0; i < treasures.size(); i++) {
			Treasure currentTreasure = treasures.get(i);
			if (price == currentTreasure.getPrice()) {
				byPrice.add(currentTreasure);
			}
		}
		return byPrice;
	}
}