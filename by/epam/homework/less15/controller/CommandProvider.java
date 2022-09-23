package by.epam.homework.less15.controller;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

	private Map<CommandName, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put(CommandName.MOST_EXPENSIVE, new MostExpensiveCommand());
		commands.put(CommandName.BY_PRICE, new ByPriceCommand());
		commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
	}

	public Command getCommand(String operation) {
		CommandName commandName;
		Command command;
		try {
			commandName = CommandName.valueOf(operation);
			command = commands.get(commandName);
			if (command == null) {
				command = commands.get(CommandName.NO_SUCH_COMMAND);
			}
		} catch (Exception e) {
			command = commands.get(CommandName.NO_SUCH_COMMAND);
		}
		return command;
	}
}