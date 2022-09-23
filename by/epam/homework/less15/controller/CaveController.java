package by.epam.homework.less15.controller;

import by.epam.homework.less15.controller.to.Request;
import by.epam.homework.less15.controller.to.Response;

public class CaveController {
	private final CommandProvider provider = new CommandProvider();

	public Response doAction(Request request) {
		String commandName = request.getCommand();
		Command command = provider.getCommand(commandName);
		Response response = command.execute(request);

		return response;
	}
}