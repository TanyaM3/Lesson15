package by.epam.homework.less15.controller;

import java.util.List;

import by.epam.homework.less15.bean.Treasure;
import by.epam.homework.less15.controller.to.Request;
import by.epam.homework.less15.controller.to.Response;
import by.epam.homework.less15.logic.CaveLogic;

public class ByPriceCommand implements Command {
	private final CaveLogic caveLogic = CaveLogic.getInstance();

	public Response execute(Request request) {
		Response response = new Response();
		int price = request.getPrice();
		List<Treasure> treasures = caveLogic.byPrice(price);
		
		response.setCommand(CommandName.BY_PRICE.toString());
		response.setTreasures(treasures);
		return response;
	}
}