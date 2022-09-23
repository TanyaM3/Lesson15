package by.epam.homework.less15.repo;

import by.epam.homework.less15.bean.Cave;
import by.epam.homework.less15.main.CaveMaker;

public class TreasureRepository {
	private static Cave cave = CaveMaker.createCave();

	public static Cave getCave() {
		return cave;
	}

	public static void setCave(Cave cave) {
		TreasureRepository.cave = cave;
	}
}