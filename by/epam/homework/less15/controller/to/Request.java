package by.epam.homework.less15.controller.to;

public class Request {

	private String command;
	private int price;

	public Request(String command) {
		this.command = command;
	}

	public Request(String command, int price) {
		this.command = command;
		this.price = price;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}