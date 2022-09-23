package by.epam.homework.less15.controller;

import java.util.List;

import by.epam.homework.less15.bean.Treasure;
import by.epam.homework.less15.controller.to.Request;
import by.epam.homework.less15.controller.to.Response;
import by.epam.homework.less15.logic.CaveLogic;

public class MostExpensiveCommand implements Command {
	private final CaveLogic caveLogic = CaveLogic.getInstance();

	public Response execute(Request request) {
		Response response = new Response();
		List<Treasure> treasures = caveLogic.mostExpensive();
		
		response.setCommand(CommandName.MOST_EXPENSIVE.toString());
		response.setTreasures(treasures);
		return response;
	}
}