package by.epam.homework.less15.controller.to;

import java.util.List;

import by.epam.homework.less15.bean.Treasure;

public class Response {

	private String command;
	private Treasure treasure;
	private List<Treasure> treasures;
	private String errorMessage;
	
	public Response() {
		
	}

	public Response(String command, Treasure treasure) {
		this.command = command;
		this.treasure = treasure;
	}

	public Response(String command, List<Treasure> treasures) {
		this.command = command;
		this.treasures = treasures;
	}

	public Response(String command, String errorMessage) {
		this.command = command;
		this.errorMessage = errorMessage;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public Treasure getTreasure() {
		return treasure;
	}

	public void setTreasure(Treasure treasure) {
		this.treasure = treasure;
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}