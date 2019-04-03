package command;

import java.awt.Image;

import sokoban.Level;

public interface Command {
	public void execute(Level l, Image i);
}
