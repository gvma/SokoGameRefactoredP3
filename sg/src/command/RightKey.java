package command;

import java.awt.Image;

import gfx.Assets;
import sokoban.Level;

public class RightKey implements Command {

	@Override
	public void execute(Level l, Image i) {
		// TODO Auto-generated method stub
		l.move(0, 1);
		i = Assets.playerRight;
	}

}
