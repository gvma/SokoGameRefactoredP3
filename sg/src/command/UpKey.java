package command;

import java.awt.Image;

import gfx.Assets;
import sokoban.Level;

public class UpKey implements Command {

	@Override
	public void execute(Level l, Image i) {
		// TODO Auto-generated method stub
		l.move(-1, 0);
		i = Assets.playerBack;
	}

}
