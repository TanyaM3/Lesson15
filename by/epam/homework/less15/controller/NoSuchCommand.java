package by.epam.homework.less15.controller;

import by.epam.homework.less15.controller.to.Request;
import by.epam.homework.less15.controller.to.Response;

public class NoSuchCommand implements Command {

	public Response execute(Request request) {
		Response response = new Response();
		response.setCommand(CommandName.NO_SUCH_COMMAND.toString());
		response.setErrorMessage("No such command");
		return response;
	}
}