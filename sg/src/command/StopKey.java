package command;

import java.awt.Image;

import sokoban.Level;

public class StopKey implements Command{
	@Override
	public void execute(Level l, Image i) {
		l.move(0,0);
		i = l.texture;
	}
}
