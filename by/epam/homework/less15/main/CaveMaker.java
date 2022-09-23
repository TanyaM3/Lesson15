package by.epam.homework.less15.main;

import java.util.ArrayList;
import java.util.List;

import by.epam.homework.less15.bean.Cave;
import by.epam.homework.less15.bean.Treasure;

public class CaveMaker {
	public static Cave createCave() {
		Cave cave = null;
		List<Treasure> treasures = new ArrayList<>();
		
		treasures.add(new Treasure("Ring", 1000, "gold ring"));
		treasures.add(new Treasure("Necklace", 1000, "diamond necklace"));
		treasures.add(new Treasure("Earings", 870, "gold earrings with emeralds"));
		treasures.add(new Treasure("Bracelet", 990, "gold bracelet with pearls"));
		treasures.add(new Treasure("Сrown", 2500, "gold crown"));
		treasures.add(new Treasure("Lamp", 2500, "gold lamp"));
		cave = new Cave(treasures);
		
		return cave;
	}
}