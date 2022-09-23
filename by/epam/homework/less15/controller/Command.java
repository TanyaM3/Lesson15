package by.epam.homework.less15.controller;

import by.epam.homework.less15.controller.to.Request;
import by.epam.homework.less15.controller.to.Response;

public interface Command {
	Response execute(Request request);
}