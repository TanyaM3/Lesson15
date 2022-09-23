package by.epam.homework.less15.main;

import by.epam.homework.less15.controller.CaveController;
import by.epam.homework.less15.controller.to.Request;
import by.epam.homework.less15.view.CaveConsoleOutput;

public class Main {

	public static void main(String[] args) {
		CaveController control = new CaveController();
		CaveConsoleOutput output = new CaveConsoleOutput();
		
		output.print(control.doAction(new Request("MOST_EXPENSIVE")));	
	}
}