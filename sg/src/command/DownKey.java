package command;

import java.awt.Image;

import gfx.Assets;
import sokoban.Level;

public class DownKey implements Command {

	@Override
	public void execute(Level l, Image texture) {
		// TODO Auto-generated method stub
		l.move(1, 0);
		texture = Assets.PlayerFront;
	}

}
