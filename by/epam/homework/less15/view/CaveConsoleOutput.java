package by.epam.homework.less15.view;

import java.util.List;

import by.epam.homework.less15.bean.Cave;
import by.epam.homework.less15.bean.Treasure;
import by.epam.homework.less15.controller.to.Response;

public class CaveConsoleOutput {

	public void print(String title, Cave cave) {
		System.out.println(title);
		List<Treasure> treasures = cave.getTreasures();
		for (int i = 0; i < treasures.size(); i++) {
			System.out.println(treasures.get(i).getName() + ", price " + treasures.get(i).getPrice());
		}
	}

	public void print(String title, List<Treasure> treasures) {
		System.out.println(title);
		for (int i = 0; i < treasures.size(); i++) {
			System.out.println(treasures.get(i).getName() + ", price " + treasures.get(i).getPrice());
		}
	}

	public void print(String title, Treasure treasure) {
		System.out.println(title);
		System.out.println(treasure.getName() + ", price " + treasure.getPrice());
	}
	
	public void print(Response response) {
		System.out.println(response.getCommand());
		for (int i = 0; i < response.getTreasures().size(); i++) {
			System.out.println(response.getTreasures().get(i).getName() + ", price " + response.getTreasures().get(i).getPrice());
		}
	}
}